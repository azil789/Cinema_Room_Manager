package cinema;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cinema {

    private static char[][] cinemaMatrix;

    static Scanner scanner = new Scanner(System.in);

    public static int purchasedTickets;
    public static float percentage;
    public static int currentIncome;
    public static int totalIncome;
    public static int totalNumSeats;



    public static void create() {
        System.out.println("Enter the number of rows:");
        int numRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numSeats = scanner.nextInt();

        cinemaMatrix = new char[numRows][numSeats];

        totalNumSeats = numRows * numSeats;

        if (totalNumSeats <= 60) {
            totalIncome = totalNumSeats * 10;
        }
        else {
            int frontHalfRows = numRows / 2;
            int backHalfRows = numRows - frontHalfRows;

            totalIncome = frontHalfRows * numSeats * 10 + backHalfRows * numSeats * 8;
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeats; j++) {
                cinemaMatrix[i][j] = 'S';
            }
        }
    }

    public static void print() {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= cinemaMatrix[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 0; i < cinemaMatrix.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < cinemaMatrix[0].length; j++) {
                System.out.print(" " + cinemaMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void buyTicket() throws Exception {
        System.out.println("Enter a row number:");
        int rowNum = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNum = scanner.nextInt();

        boolean wrongInput;
        boolean alreadyPurchased;


        if (cinemaMatrix[rowNum - 1][seatNum - 1] == 'B') {
            alreadyPurchased = true;
            while (alreadyPurchased) {
                System.out.println("That ticket has already been purchased!");
                System.out.println("Enter different coordinates: ");
                System.out.println("Enter a row number:");
                rowNum = scanner.nextInt();
                System.out.println("Enter a seat number in that row:");
                seatNum = scanner.nextInt();

                if (cinemaMatrix[rowNum - 1][seatNum - 1] != 'B') {
                    alreadyPurchased = false;
                }
            }
        }

           else if (rowNum > cinemaMatrix.length || seatNum > cinemaMatrix[0].length) {
                    throw new Exception("Wrong input");
            }

            if (cinemaMatrix[rowNum - 1][seatNum - 1] != 'B') {

                int totalSeats = cinemaMatrix.length * cinemaMatrix[0].length;


                int ticketPrice;

                if (totalSeats <= 60) {
                    ticketPrice = 10;
                } else {
                    int frontHalf = cinemaMatrix.length / 2;
                    if (rowNum <= frontHalf) {
                        ticketPrice = 10;
                    } else {
                        ticketPrice = 8;
                    }
                }


                System.out.println("Ticket price: " + "$" + ticketPrice);

                if (ticketPrice == 10) {
                    currentIncome += 10;
                } else {
                    currentIncome += 8;
                }


                cinemaMatrix[rowNum - 1][seatNum - 1] = 'B';

                purchasedTickets += 1;
            }

    }






    public static void statistics() {
        System.out.println("Number of purchased tickets: " + purchasedTickets);
        float percentage =  (((float) purchasedTickets / (float) totalNumSeats) * (float) 100);
        String x = String.format("%.2f", percentage);
        System.out.println("Percentage: " + x + "%");
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);

    }



    public static void main(String[] args) {
        // Write your code here
        create();


        int userInput;

        do {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    print();
                    break;
                case 2:
                    try {
                        buyTicket();
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Wrong input. Try again: ");
                    }
                    break;
                case 3:
                    statistics();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error");

            }
        } while (userInput != 0);

    }


}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n / 2 || i == n / 2 || j == i || j == n - (i + 1)) {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("." + " ");
                }
            }
            System.out.println();
        }

    }
}
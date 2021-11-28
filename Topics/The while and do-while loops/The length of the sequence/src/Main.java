import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int counter = 0;
        int input = scanner.nextInt();
        while (input != 0) {
            input = scanner.nextInt();
            counter++;
        }
        System.out.println(counter);
    }
}
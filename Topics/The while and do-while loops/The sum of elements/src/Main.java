import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int input = scanner.nextInt();

        while (input != 0) {
            sum += input;
            input = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
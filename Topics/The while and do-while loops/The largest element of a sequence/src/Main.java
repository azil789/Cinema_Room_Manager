import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int largest = 0;

        int n = scanner.nextInt();
        do {
            if (n > largest) {
                largest = n;
            }
            n = scanner.nextInt();
        } while (n > 0);

        System.out.println(largest);

    }
}
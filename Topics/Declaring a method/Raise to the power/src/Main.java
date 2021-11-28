import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        // write your code here
        if (m == 0) {
            return 1;
        }
        else if (m == 1) {
            return n;
        }
        else {
            return n * power(n, m - 1);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }




        for (int i = 0; i < m; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[n - j - 1][i] + " ");
            }
            System.out.println();
        }



    }
}
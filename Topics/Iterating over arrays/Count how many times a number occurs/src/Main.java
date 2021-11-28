import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here.
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }


        System.out.println(count);



    }
}
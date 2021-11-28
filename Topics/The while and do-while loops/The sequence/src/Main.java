import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int largest = 0;
        int numElem = scanner.nextInt();
        int i = 0;

        while (i < numElem) {
            int elem = scanner.nextInt();
            if (elem > largest && elem % 4 == 0) {
                largest = elem;
            }
            i++;
        }
        System.out.println(largest);
    }
}
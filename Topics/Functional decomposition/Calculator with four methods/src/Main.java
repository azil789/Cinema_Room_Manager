class SimpleCalculator {
    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        System.out.print(a - b);
    }


    public static void sumTwoNumbers(long a, long b) {
        System.out.print(a + b);
    }


    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.print("Division by 0!");
        }
        else {
            System.out.print(a / b);
        }
    }


    public static void multiplyTwoNumbers(long a, long b) {
        System.out.print(a * b);
    }
}
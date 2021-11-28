class ArrayOperations {
    public static void printCorners(int[][] x) {
        // write your code here
        if (x.length > 0 && x[0].length > 0) {
            System.out.printf(
                    "%s %s%n%s %s%n",
                    x[0][0],                                     // top-left corner
                    x[0][x[0].length - 1],                       // top-right corner
                    x[x.length - 1][0],                          // bottom-left corner
                    x[x.length - 1][x[x.length - 1].length - 1]  // bottom-right corner
            );


        }
    }
}
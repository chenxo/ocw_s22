public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), width = Integer.parseInt(args[1]);
        /** this is the iterative way. less cleverness required. constrained problem. */
        for (int row = 0; row < n; row++) {
            // n * row gives us the first entry of the row
            for (int col = 0; col < n; col++) {
                if (col > row - 1 - width && col < row + 1 + width) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
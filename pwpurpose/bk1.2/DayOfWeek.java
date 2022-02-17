public class DayOfWeek {
    /**
     *  takes a date as input and prints the day of the week
     *  that date falls on. Your program should take 3 command-line arguments:
     *  m (month), d (day), and y (year). For m use 1 for Jan, 2 for Feb, & so forth.
     *  For output print 0 for Sun, 1 for Mon, 2 for Tues, and so forth.
     *  Use the following formulas, for the Gregorian calendar
     *  (where / denotes integer division):
     * y0 = y − (14 − m) / 12
     * x = y0 + y0 / 4 − y0 / 100 + y0 / 400
     * m0 = m + 12 × ((14 − m) / 12) − 2
     * d0 = (d + x + 31m0 / 12) mod 7
     * @param args
     */
    public static void main(String[] args) {
        // Prints "Hello, World" in the terminal window.
        // System.out.println("Hello, World");
        int m = Integer.parseInt(args[0]), d = Integer.parseInt(args[1]), y= Integer.parseInt(args[2]);
        System.out.println(m + " " + d + " " + y);
        int y0 = y - (14 - m) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0 / 12)) % 7;
        System.out.println(d0);
    }
}
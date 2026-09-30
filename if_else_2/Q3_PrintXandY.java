/*
 * Assignment : if_else_2.pdf  -  Question 3
 * Task       : Declare two variables x and y.
 *                - Assign values to these variables.
 *                - Number x should be printed only if it is less than 2000 or
 *                  greater than 3000.
 *                - Number y should be printed only if it is between 100 and 500.
 *
 * Approach   : Assign the values, then use two independent if-statements. The
 *              logical OR (||) covers the two acceptable ranges for x, while
 *              logical AND (&&) covers the acceptable range for y.
 */
public class Q3_PrintXandY {
    public static void main(String[] args) {
        int x = 3500;   // change this value to test the condition
        int y = 250;    // change this value to test the condition

        System.out.println("Values assigned: x = " + x + ", y = " + y);
        System.out.println();

        if (x < 2000 || x > 3000) {
            System.out.println("x = " + x);
        } else {
            System.out.println("x is not printed (it must be < 2000 or > 3000)");
        }

        if (y > 100 && y < 500) {
            System.out.println("y = " + y);
        } else {
            System.out.println("y is not printed (it must be between 100 and 500)");
        }
    }
}

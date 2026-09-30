/*
 * Assignment : for_1.pdf  -  Question 3
 * Task       : Display the following patterns
 *
 *   (a)  1          (b)  12345
 *        12               1234
 *        123              123
 *        1234             12
 *        12345            1
 *
 * Approach   : Two sets of nested loops. Pattern (a) grows the inner counter
 *              from 1 up to the row number; pattern (b) shrinks it down from
 *              the row number to 1.
 */
public class Q3_Patterns {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Pattern (a):");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern (b):");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
 * Assignment : for_2.pdf  -  Question 2
 * Task       : Generate the following pattern
 *
 *   1
 *   1 2
 *   1 2 3
 *   1 2 3 4
 *   1 2 3 4 5
 *   1 2 3 4 5 6
 *   1 2 3 4 5 6 7
 *   1 2 3 4 5 6 7 8
 *   1 2 3 4 5 6 7 8 9
 *
 * Approach   : For each row i (1 to 9) print the numbers 1..i separated by a
 *              single space, then move to the next line.
 */
public class Q2_TrianglePattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

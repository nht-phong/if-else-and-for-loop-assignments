/*
 * Assignment : for_1.pdf  -  Question 1
 * Task       : Write a program to print the series 100, 95, 90, 85, ..., 5
 *
 * Approach   : A single for-loop starts at 100 and decreases by 5 each
 *              iteration, stopping once the value goes below 5.
 */
public class Q1_Series {
    public static void main(String[] args) {
        for (int i = 100; i >= 5; i -= 5) {
            System.out.print(i);
            if (i > 5) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

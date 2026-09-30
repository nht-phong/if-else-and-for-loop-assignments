/*
 * Assignment : for_1.pdf  -  Question 2
 * Task       : Accept two numbers num1 and num2. Find the sum of all odd
 *              numbers between the two numbers entered.
 *
 * Approach   : Work out the smaller and larger of the two inputs, then loop
 *              over every integer strictly between them. Odd numbers are
 *              added to a running total.
 *
 * Note       : "Between" is treated as exclusive of the two entered numbers.
 *              Change the loop bounds to `i = low` / `i <= high` if your
 *              teacher wants the end points included.
 */
import java.util.Scanner;

public class Q2_SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number (num1): ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number (num2): ");
        int num2 = sc.nextInt();

        int low = Math.min(num1, num2);
        int high = Math.max(num1, num2);

        int sum = 0;
        for (int i = low + 1; i < high; i++) {
            if (i % 2 != 0) {   // works for negative odd numbers too
                sum += i;
            }
        }

        System.out.println("Sum of all odd numbers between " + num1 + " and " + num2 + " = " + sum);
        sc.close();
    }
}

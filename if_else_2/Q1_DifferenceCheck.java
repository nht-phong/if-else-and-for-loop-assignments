/*
 * Assignment : if_else_2.pdf  -  Question 1
 * Task       : Accept 2 numbers. Calculate the difference between the two
 *              values.
 *                - If the difference is equal to any of the values entered,
 *                  display: "Difference is equal to value <number of value entered>"
 *                - If the difference is not equal to any of the values entered,
 *                  display: "Difference is not equal to any of the values entered"
 *
 * Approach   : Use the absolute difference so the result is always positive,
 *              then compare it against both inputs.
 */
import java.util.Scanner;

public class Q1_DifferenceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        int difference = Math.abs(first - second);
        System.out.println("Difference = " + difference);

        if (difference == first) {
            System.out.println("Difference is equal to value " + first);
        } else if (difference == second) {
            System.out.println("Difference is equal to value " + second);
        } else {
            System.out.println("Difference is not equal to any of the values entered");
        }

        sc.close();
    }
}

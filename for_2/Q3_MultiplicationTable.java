/*
 * Assignment : for_2.pdf  -  Question 3
 * Task       : Write a program to print a multiplication table for a given
 *              number.
 *
 * Approach   : Read the number, then loop from 1 to 10 printing the product
 *              at each step.
 */
import java.util.Scanner;

public class Q3_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}

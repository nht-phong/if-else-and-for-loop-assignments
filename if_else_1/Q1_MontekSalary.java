/*
 * Assignment : if_else_1.pdf  -  Question 1
 * Task       : Montek company gives allowances to its employees depending on
 *              their grade:
 *
 *                  Grade   | Allowance
 *                  --------+----------
 *                  A       | 300
 *                  B       | 250
 *                  Others  | 100
 *
 *              Calculate the salary at the end of the month.
 *              (Accept Salary and Grade from the user)
 *
 * Approach   : Read the basic salary and the grade. Pick the allowance with an
 *              if / else-if / else chain, then add it to the salary.
 */
import java.util.Scanner;

public class Q1_MontekSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter the grade (A / B / other): ");
        char grade = sc.next().toUpperCase().charAt(0);

        int allowance;
        if (grade == 'A') {
            allowance = 300;
        } else if (grade == 'B') {
            allowance = 250;
        } else {
            allowance = 100;
        }

        int endOfMonthSalary = salary + allowance;

        System.out.println("Grade            : " + grade);
        System.out.println("Allowance        : " + allowance);
        System.out.println("Salary at the end of the month = " + endOfMonthSalary);

        sc.close();
    }
}

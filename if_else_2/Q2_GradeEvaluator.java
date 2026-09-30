/*
 * Assignment : if_else_2.pdf  -  Question 2
 * Task       : Evaluate the grade of a student for the following constraints:
 *                - marks > 75           -> grade A
 *                - 60 < marks < 75      -> grade B
 *                - 45 < marks < 60      -> grade C
 *                - 35 < marks < 45      -> grade D
 *                - marks < 35           -> grade E
 *
 * Approach   : An if / else-if ladder checked from the highest band down.
 *              Because earlier branches already handle the upper limits, each
 *              later branch only needs a single comparison.
 */
import java.util.Scanner;

public class Q2_GradeEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        char grade;
        if (marks > 75) {
            grade = 'A';
        } else if (marks > 60) {   // 60 < marks <= 75
            grade = 'B';
        } else if (marks > 45) {   // 45 < marks <= 60
            grade = 'C';
        } else if (marks > 35) {   // 35 < marks <= 45
            grade = 'D';
        } else {                   // marks <= 35
            grade = 'E';
        }

        System.out.println("Marks = " + marks);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}

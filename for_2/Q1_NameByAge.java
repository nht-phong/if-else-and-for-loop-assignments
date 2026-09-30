/*
 * Assignment : for_2.pdf  -  Question 1
 * Task       : Declare a variable which has the age of the person. Print the
 *              user's name as many times as his age.
 *
 * Approach   : Read the name and age, then use a for-loop that runs once for
 *              every year of the age.
 */
import java.util.Scanner;

public class Q1_NameByAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        for (int i = 1; i <= age; i++) {
            System.out.println(i + ". " + name);
        }

        sc.close();
    }
}

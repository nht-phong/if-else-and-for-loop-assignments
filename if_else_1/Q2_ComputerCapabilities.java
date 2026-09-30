/*
 * Assignment : if_else_1.pdf  -  Question 2
 * Task       : Show the computer's capabilities. The user types in a letter of
 *              the alphabet and the program displays the matching language or
 *              package:
 *
 *                  Input   | Output
 *                  --------+-----------
 *                  A or a  | Ada
 *                  B or b  | Basic
 *                  C or c  | Cobol
 *                  D or d  | dBase III
 *                  f or F  | Fortran
 *                  p or P  | Pascal
 *                  V or v  | Visual C++
 *
 *              Use the 'switch' statement to choose and display the appropriate
 *              message. Use the default label to display a message if the input
 *              does not match any of the above letters.
 *
 * Approach   : Convert the entered letter to upper case, then switch on it so
 *              that both upper and lower case inputs are handled by one case.
 */
import java.util.Scanner;

public class Q2_ComputerCapabilities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter of the alphabet: ");
        char letter = sc.next().charAt(0);

        switch (Character.toUpperCase(letter)) {
            case 'A':
                System.out.println("Ada");
                break;
            case 'B':
                System.out.println("Basic");
                break;
            case 'C':
                System.out.println("Cobol");
                break;
            case 'D':
                System.out.println("dBase III");
                break;
            case 'F':
                System.out.println("Fortran");
                break;
            case 'P':
                System.out.println("Pascal");
                break;
            case 'V':
                System.out.println("Visual C++");
                break;
            default:
                System.out.println("Sorry, no language or package is listed for '" + letter + "'");
        }

        sc.close();
    }
}

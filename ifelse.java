import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Read the integer input
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Step 3: Check the conditions
        if (n % 2 != 0) {    // If n is odd
            System.out.println("Weird");
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {    // Even and in range 2 to 5
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {   // Even and in range 6 to 20
            System.out.println("Weird");
        } else if (n % 2 == 0 && n > 20) {        // Even and greater than 20
            System.out.println("Not Weird");
        }

        // Close the scanner
        scanner.close();
    }
}

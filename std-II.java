import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Read the integer
        int i = scanner.nextInt();

        // Step 3: Read the double
        double d = scanner.nextDouble();

        // Step 4: Read the newline character before reading the string
        scanner.nextLine(); // Consume the leftover newline character

        // Step 5: Read the string
        String s = scanner.nextLine();

        // Step 6: Print the output in reverse order
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        // Close the scanner
        scanner.close();
    }
}

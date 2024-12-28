public class Solution {
    public static void main(String[] args) {
        DoNotTerminate.forbidExit(); // Step 1: Prevent the program from terminating early

        try {
            Scanner in = new Scanner(System.in); // Step 2: Read input
            int n = in.nextInt(); // Read an integer value
            in.close();

            // Step 3: Convert the integer to a string
            String s = Integer.toString(n);

            // Step 4: Validate the conversion
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job"); // Output "Good job" if conversion is correct
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!"); // Step 5: Handle forbidden termination
        }
    }
}

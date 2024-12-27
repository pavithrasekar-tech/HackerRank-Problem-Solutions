import java.util.Scanner;

public class Solution {
    // Static variables
    static int b, h;
    static boolean flag = true;

    // Static initialization block
    static {
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        h = scanner.nextInt();

        // Validate the input
        if (b <= 0 || h <= 0) {
            flag = false; // Set flag to false if the input is invalid
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        if (flag) { // Only calculate area if input is valid
            int area = b * h;
            System.out.println(area);
        }
    }
}

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int a = in.nextInt(); // Initial value
            int b = in.nextInt(); // Incremental value
            int n = in.nextInt(); // Number of terms in the series

            int currentValue = a;
            for (int j = 0; j < n; j++) {
                // Calculate the next term: currentValue += 2^j * b
                currentValue += (int) Math.pow(2, j) * b;

                // Print the term (no newline yet)
                System.out.print(currentValue + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

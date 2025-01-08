import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
    int positivecount = 0;
    int negativecount = 0;
    int zerocount = 0;
    int total = arr.size();
    
    for(int num : arr) {
        if(num > 0) {
            positivecount ++;
        } else if( num < 0) {
            negativecount ++;
        } else {
            zerocount ++;
        }
    } 
    double positiveratio = (double) positivecount / total;
    double negativeratio = (double) negativecount / total;
    double zeroratio = (double) zerocount / total;
    
    System.out.println(String.format("%.6f", positiveratio));
    System.out.println(String.format("%.6f", negativeratio));
    System.out.println(String.format("%.6f", zeroratio));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

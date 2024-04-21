import java.util.*;

public class Solution {
    public int[] solution(long n) {
        String number = Long.toString(n);
        String str =  new StringBuilder(number).reverse().toString();
        char[] arr = str.toCharArray();
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] - '0';
            // result[i] = Character.getNumericValue(arr[i]);
        }
        
        return result;
    }
}
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i =0 ;i< arr.length; i++){
            if(i == 0){
                stack.push(arr[i]);
            }
            if(!stack.peek().equals(arr[i])){
                stack.push(arr[i]);
            }
        }
        
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
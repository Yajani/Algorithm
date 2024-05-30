import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        int number = 0; 
        for(int i = 0 ; i < array.length; i++){
            if( min > Math.abs(array[i]-n)){
                min = Math.abs(array[i]-n);
                number = array[i];
            }else if(min == Math.abs(array[i]-n) && array[i] < number){
                number = array[i];
            }
        }
        return number;
    }
}
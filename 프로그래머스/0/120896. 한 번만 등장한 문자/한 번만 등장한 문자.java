import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int count = 0;
        
        //알파벳 순으로 정렬
        Arrays.sort(arr);
        
        for(int i =0 ; i<arr.length; i++){
            count = 0 ; 
            for(int j = 0 ; j < arr.length; j++){
                if(arr[i].equals(arr[j])){
                    count++; //중복된 알파벳이 있다면 count++ 
                }
            }
            if(count == 1){
                answer += arr[i];
            }
        }
        
        return answer;
    }
}
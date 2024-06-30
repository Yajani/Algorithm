import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length()/n;
        int count = 0;
        if( my_str.length()%n != 0){
            len++;
        }
        String[] answer = new String[len];
        for(int i = 0; i <answer.length; i++){
            if(i == answer.length-1){
                answer[i] = my_str.substring(count);
            }else{
                answer[i] = my_str.substring(count,count+n);  
            }
            count+=n;
        }
        return answer;
    }
}
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
    
        while(n>0){
            answer += n%10; //일의자릿수만 남기기
            n /= 10; //일의 자릿수 없애버리기 
        }
    
        return answer;
    }
}
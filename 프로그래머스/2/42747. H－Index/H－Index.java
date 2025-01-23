import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i = 0; i<citations.length; i++){
            int h = citations.length - i ; //h번 이상인용된 논문의 수 
            
            if(citations[i] >= h){ //인용된 논문의 수가 h편 이하일때
                answer = h;  //해당 위치의 논문의 인용 횟수가 `h` 이상인지 확인
                break;
            }  
        }
        
        return answer;
    }
}
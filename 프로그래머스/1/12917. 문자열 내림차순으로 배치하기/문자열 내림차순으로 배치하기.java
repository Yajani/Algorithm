import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        //내림차순으로 배열을 정렬
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String a : str)
           answer += a;
        return answer;
    }
}
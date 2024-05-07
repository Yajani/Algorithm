import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
/*         my_string 에서 s 부터 e 까지 문자열을 뽑아내 변수 선언,
뽑은 문자열의 순서를 반대로 바꾸어준다.
그후 뽑은 문자열과 바뀔 문자열을 replace. */
        StringBuilder answer = new StringBuilder();
        StringBuilder str = new StringBuilder(my_string);
        
 
        answer.append(str.substring(0, s)) 
              .append((new StringBuilder(str.substring(s, e + 1)).reverse()))
              .append(str.substring(e + 1));
              
        return answer.toString();
    }
}
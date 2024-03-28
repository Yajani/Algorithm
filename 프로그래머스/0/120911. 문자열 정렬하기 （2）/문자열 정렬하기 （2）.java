import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String my_string_S = my_string.toLowerCase();
        String[] s = my_string_S.split("");
        Arrays.sort(s);
        for(int i = 0 ;i<s.length; i++){
            answer += s[i];
        }
        return answer;
    }
}
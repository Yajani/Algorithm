import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> used = new HashSet<>();
        
        StringBuilder builder = new StringBuilder();
        for(char c: my_string.toCharArray()){
            //used에 검사해서 값이 있으면 건너뛰기(중복제거)
            if(used.contains(c)) continue;
            used.add(c);
            builder.append(c);
        }        
        
        return builder.toString();
    }
}
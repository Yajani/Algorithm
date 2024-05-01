import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder builder = new StringBuilder(); 
        
        for(char c: s.toCharArray()){
            if(!Character.isAlphabetic(c)){
                builder.append(c);
            }else{
                int offset = Character.isUpperCase(c)?'A':'a';
                int position = c-offset;
                position = (position+n)%('Z'-'A'+1);
                builder.append((char)(position+offset));
            }
        }
        
        return builder.toString();
    }
}
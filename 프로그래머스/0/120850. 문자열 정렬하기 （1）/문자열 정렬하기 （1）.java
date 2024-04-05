import java.util.*;
class Solution {
    public List solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        //^는 0-9의 숫자가 아닌 문자열
        String[] str = my_string.replaceAll("[^0-9]","").split("");
        Arrays.sort(str);
        
        for(int i = 0; i<str.length; i++){
             answer.add(Integer.parseInt(str[i]));
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] alpha = {"a", "e", "i", "o", "u"};
        
        for (String v : alpha) {
            answer = answer.replaceAll(v, "");
        }
        
        return answer;
    }
}
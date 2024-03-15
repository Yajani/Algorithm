class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if (currentChar == 'A' || currentChar == 'a') {
                //toUpperCase는 char이 아니라 String에서만 사용가능하다
                answer += String.valueOf(currentChar).toUpperCase();
            } else {
                answer += String.valueOf(currentChar).toLowerCase();
            }
        }
        return answer;
    }
}
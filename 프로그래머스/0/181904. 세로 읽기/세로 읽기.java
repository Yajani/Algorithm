class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        int startIndex = c - 1;
        while (startIndex < my_string.length()) {
            answer.append(my_string.charAt(startIndex));
            //m만큼 더하면 startindex가 해당하는 다음열로 위치한다
            startIndex += m;
        }

        return answer.toString();
    }
}
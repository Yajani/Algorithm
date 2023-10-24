class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] list = message.split("");
        answer = list.length * 2;
        return answer;
    }
}
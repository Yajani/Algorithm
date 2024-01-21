class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String number = null;
        number = Integer.toString(a) + Integer.toString(b);
        answer = (2*a*b > Integer.parseInt(number)) ? 2*a*b : Integer.parseInt(number);
        return answer;
    }
}
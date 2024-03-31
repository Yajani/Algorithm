class Solution {
    public String solution(String n_str) {
        //"^"는 문자열 시작을 의미하고 "0+"는 0이 1개 이상인 패턴
        String answer = n_str.replaceFirst("^0+", "");
        return answer;
    }
}
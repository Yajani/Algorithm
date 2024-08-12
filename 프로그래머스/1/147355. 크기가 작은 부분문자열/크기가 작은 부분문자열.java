class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pValue = Long.parseLong(p);  // p를 long으로 변환하여 큰 숫자도 처리 가능하도록

        // 문자열 t를 p의 길이만큼 슬라이싱하여 비교
        for (int i = 0; i <= t.length() - pLength; i++) {
            // substring(i, i + pLength)로 t에서 길이 pLength만큼의 부분 문자열을 추출
            long tValue = Long.parseLong(t.substring(i, i + pLength));
            if (tValue <= pValue) {
                answer++;
            }
        }
        return answer;
    }
}
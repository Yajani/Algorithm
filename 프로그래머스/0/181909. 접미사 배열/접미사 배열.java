import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] suffixes = new String[length];

        // 모든 접미사 생성(i번 인덱스부터 끝까지의 부분 문자열을 저장)
        for (int i = 0; i < length; i++) {
            suffixes[i] = my_string.substring(i);
        }

        // 접미사 배열을 사전순으로 정렬
        Arrays.sort(suffixes);

        return suffixes;
    }
}
public class Solution {
    public String solution(String s, int[][] queries) {
        // 문자열을 문자 배열로 변환
        char[] charArray = s.toCharArray();

        // 각 쿼리에 대해 해당 구간을 뒤집는 작업을 수행
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            reverse(charArray, start, end);
        }

        // 최종적으로 배열을 문자열로 변환
        return new String(charArray);
    }

    // 특정 구간을 뒤집는 함수
    private void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // 메인 함수 (테스트용)
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcdef";
        int[][] queries = {{0, 2}, {2, 4}, {0, 5}};
        
        System.out.println(sol.solution(s, queries));  // 출력: "fedcba"
    }
}
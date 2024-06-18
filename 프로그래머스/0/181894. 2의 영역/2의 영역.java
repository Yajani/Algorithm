import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // 초기값으로 배열의 길이보다 큰 값을 가진 변수를 설정
        int firstIndex = 100000, lastIndex = 0;
        // 배열을 순회하면서 숫자 2가 나타나는 첫 인덱스와 마지막 인덱스를 찾음
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstIndex = Math.min(firstIndex, i);
                lastIndex = Math.max(lastIndex, i);
            }
        }
        // 만약 숫자 2가 배열 안에 존재한다면 해당 부분 배열을 반환 
        if (firstIndex <= lastIndex) {
            return Arrays.copyOfRange(arr, firstIndex, lastIndex + 1);
        } else {    //  그렇지 않다면 {-1}을 반환
            return new int[]{-1};
        }
    }
}
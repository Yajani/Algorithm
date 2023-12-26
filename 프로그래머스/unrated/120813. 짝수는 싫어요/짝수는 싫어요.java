import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        //홀수의 갯수는 +1 /2
        int[] arr = new int[(n + 1) / 2];
        int index = 0;

        for (int i = 1; i <= n; i += 2) {
            arr[index++] = i;
        }

        return arr;
    }
}
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arr2.add(arr[i]);
            }
        }

     
        if (arr2.isEmpty()) {
            return new int[]{-1};
        }


        int[] answer = new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
            answer[i] = arr2.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}
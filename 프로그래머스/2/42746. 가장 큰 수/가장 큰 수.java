import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        //앞자리 숫자가 큰 수가 먼저 와야 가장 큰 수를 만들 수 있기 때문에 이를 기준으로 내림차순으로 숫자를 정렬
String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if (arr[0].equals("0")) {
           return "0";
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }


        return answer.toString();
    }
}
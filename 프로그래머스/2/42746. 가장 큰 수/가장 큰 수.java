import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        //앞자리 숫자가 큰 수가 먼저 와야 가장 큰 수를 만들 수 있기 때문에 이를 기준으로 내림차순으로 숫자를 정렬
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);//문자 값으로 변환
        }

        //s2+s1와 s1+s2를 비교하여 더 큰 수를 반환
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2)); //정렬
        
        if (arr[0].equals("0")) {
           return "0"; //앞글자가 0일때
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }


        return answer.toString();
    }
}
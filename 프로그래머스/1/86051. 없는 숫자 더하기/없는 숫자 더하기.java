class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        for(int i =0; i<numbers.length;i++){
            sum += numbers[i]; //모두 더한 합을 구함
        }
        answer = 45 -sum; //0~9를 더하면 45니깐 거기서 빼준 값을 리턴
        return answer;
    }
}

//전체에서 없는숫자더하기니까 전체에서 있는숫자들을 더해서 빼준다 !!
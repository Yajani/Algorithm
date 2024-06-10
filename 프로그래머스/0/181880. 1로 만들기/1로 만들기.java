class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0 ; i< num_list.length; i++){
            int count = 0;
            int num = num_list[i];
            while(num != 1){
                if(num %2 == 0){
                    num = num / 2;
                    count++;
                }else if(num % 2 != 0){
                    num = (num -1)/2;
                    count++;
                }
            }
            answer += count;
        }
        return answer;
    }
}
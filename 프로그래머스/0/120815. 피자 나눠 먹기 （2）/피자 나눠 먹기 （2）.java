class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 1;
        while(true){
            if(6*count % n != 0){
                answer++;
            }else{
                break;
            }
            count++;
        }
        return answer;
    }
}
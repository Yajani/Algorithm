class Solution {
    public int solution(int n) {
        int number = 1;
        int answer = 0; 
        
        for(int i = 1; i<= 10 ; i++){
            number *= i;
            if(number > n){
                answer = i - 1;
                break;
            }else if(number == n){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
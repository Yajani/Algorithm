class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i< absolutes.length; i++){
            int a = 0;
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer += (-1*absolutes[i]);
            }
        }
        return answer;
    }
}
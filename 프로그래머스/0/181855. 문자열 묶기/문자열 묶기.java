class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[30];
        
        for(String str: strArr){
            for(int i =0 ; i<30 ; i ++){
                if(str.length() == (i+1)){
                    count[i] += 1;
                }
            }
        }
        for(int i = 0; i < count.length; i++){
            if(answer <= count[i]){
                answer = count[i];
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int num = 1;
        
        // for(int i=0; i< 100; i++){
        //     if(slice * i / n  > 0){
        //         answer = i;
        //         break;
        //     }
        // }
        while(true){
            if(slice * num / n  > 0){
                answer = num;
                break;
            }
            num++; 
        }
        
        return answer;
    }
}
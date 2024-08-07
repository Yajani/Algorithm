class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        int len =0;
        while(!s.equals("1")){
            answer[0]++;
            len =0;
            for(int i =0; i<s.length();i++){
                if(s.charAt(i) =='0'){
                    answer[1]++;
                }else{
                    len++;
                }
            }
            s = Integer.toBinaryString(len);
        }
        
        return answer;
    }
}
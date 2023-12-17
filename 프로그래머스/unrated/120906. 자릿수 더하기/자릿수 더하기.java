class Solution {
    public int solution(int n) {
        int answer = 0;
        //int -> string 형 변환
        String N = Integer.toString(n);
        
        for(int i= 0; i < N.length(); i++){
            //char -> int 형 변환
            answer += Character.getNumericValue(N.charAt(i));
        }
        
        return answer;
    }
}
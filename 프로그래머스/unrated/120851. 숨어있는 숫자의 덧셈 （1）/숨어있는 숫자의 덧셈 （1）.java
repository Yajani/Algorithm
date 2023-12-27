class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char ch[] = my_string.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 48 && ch[i] <= 57){
                //'0' 아스키코드 값을 뺀다(char -> int 변환)
                //Character.getNumericValue(char c)도 사용가능
                 answer += ch[i] - '0';
            }
        }
        return answer;
    }
}
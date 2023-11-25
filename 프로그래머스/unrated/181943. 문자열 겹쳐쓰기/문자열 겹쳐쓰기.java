class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        //첫번째부터 s까지의 문자열
        String str = my_string.substring(0,s);
        
        // s번째부터 overwrite_string길이이후의 문자열 저장 
        String ostr= my_string.substring(s+overwrite_string.length());
        //합치기
        answer=str+overwrite_string+ostr;
        
        return answer;
    }
}
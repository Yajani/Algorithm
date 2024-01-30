class Solution {
    public String solution(String my_string) {
        String answer = "";
            for(int i=0; i<my_string.length(); i++){
                //대문자라면
                if (Character.isUpperCase(my_string.charAt(i))) {
                    //소문자로 변환후 문자 더하기
                    answer += Character.toLowerCase(my_string.charAt(i));
                } else {
                    //대문자가 아니라면 대문자로 변환 후 더하기 
                    answer += Character.toUpperCase(my_string.charAt(i));
                }

            }
        return answer;
    }
}
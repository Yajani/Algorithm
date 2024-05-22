class Solution {
    public int solution(String number) {
        int sum = 0;
        String[] s = number.split("");
        
        for(int i = 0; i < s.length; i++){
            sum += Integer.parseInt(s[i]);
        }
        return sum%9;
    }
}
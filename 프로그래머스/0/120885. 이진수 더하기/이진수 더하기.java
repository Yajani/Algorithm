class Solution {
    public String solution(String bin1, String bin2) {
        //이진수를 정수로 변환
        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);
        int res = num1+num2;
        
        //정수를 이진수로 변환
        return Integer.toBinaryString(res);
    }
}
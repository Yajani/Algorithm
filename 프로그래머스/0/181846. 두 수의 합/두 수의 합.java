import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        //수가 클 때는 BigInteger 사용 
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        
        BigInteger sum = numA.add(numB);
        
        return sum.toString();
    }
}
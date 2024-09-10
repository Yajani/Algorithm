import java.math.BigInteger;

public class Solution {
    
    public BigInteger fac(int n){
        if(n <= 1){
            return BigInteger.valueOf(n);
        } else {
            return BigInteger.valueOf(n).multiply(fac(n - 1));
        }
    }
    
    public BigInteger solution(int balls, int share) {
        if(balls == share || balls == 0) {
            return BigInteger.ONE;
        }
        
        BigInteger numerator = fac(balls);
        BigInteger denominator = fac(balls-share).multiply(fac(share));
        
        BigInteger answer = numerator.divide(denominator);
        
        return answer;
    }
}
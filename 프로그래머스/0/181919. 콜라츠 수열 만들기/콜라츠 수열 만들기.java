import java.util.*;

class Solution {
    public List solution(int n) {
        int n2 = n;
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n2 != 1){
            if(n2 % 2 == 0){
                n2 = n2/2;
                answer.add(n2);
            }else{
                n2 = 3 * n2 + 1;
                answer.add(n2);
            }
        }
        return answer;
    }
}
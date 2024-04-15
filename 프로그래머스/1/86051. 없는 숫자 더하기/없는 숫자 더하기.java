import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<Integer>();
        for(int v : numbers){
            set.add(v); //입력받은 숫자 넣어주기
        }
        
        int sum = 0;
        for(int i =0 ; i<= 9; i++){ //1~9까지 숫자를 순회하며 set에 포함되어있지 않은 숫자의 합을 구해서 반환
            if(set.contains(i)) continue;
            sum += i;
        }
        return sum;
    }
}


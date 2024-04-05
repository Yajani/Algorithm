import java.util.*;

class Solution {
    public int solution(int[] nums) {
        //최대값을 구하기 위해 nums의 length에 2를 나눈 값을 max에 대입한다.
        int max = nums.length / 2 ; 
        
        //중복 제거하기
        HashSet<Integer> numsSet = new HashSet<>();
        
        for(int num: nums){
            numsSet.add(num);
        }
        //중복제거 완료
        
        //중복을 제거한 Set의 크기가 max보다 크면 max를, 작으면 Set사이즈를 리턴한다.
        if(numsSet.size() > max){
            return max;
        }else{
            return numsSet.size();
        }
        
    }
}
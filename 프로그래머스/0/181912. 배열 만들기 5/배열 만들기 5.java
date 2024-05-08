import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        // 문자열 배열에서 문자에서 범위에 해당하는 문자열을 뽑아서 정수로 변환한뒤에 k 값이랑 비교해서 정수배열로 리턴한다
        for(int i =0 ; i<intStrs.length; i++){
            String str = "";
            for(int j = s ; j < s+l; j++){
               str += intStrs[i].charAt(j);
            }
            if(Integer.parseInt(str) > k){
                answer.add(Integer.parseInt(str));
            }
        }
        //리스트를 배열로 변환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
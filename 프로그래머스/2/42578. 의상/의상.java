import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        //옷을 종류별로 구분
        HashMap<String, Integer> map = new HashMap<>();
        
        // Key에 해당하는 Value가 있으면 가져오고, 아닐 경우 0을 Default로 지정하여 사용하겠다는 의미의 함수이다.
        for(String[] clothe: clothes ){
            String type = clothe[1];
            map.put(type, map.getOrDefault(type,0)+1);
        }
        
        // 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        
        while(it.hasNext())
            answer *= it.next().intValue() + 1;

        // 3. 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;        
        
    }
}
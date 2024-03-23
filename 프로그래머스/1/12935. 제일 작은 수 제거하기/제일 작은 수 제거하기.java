import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        
        if(arr.length == 1 ){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length -1];
        
        for(int i =0 ;  i< arr.length; i++){
            if(min >= arr[i]){
                min = arr[i];
            }
        }
        
                int index = 0;  //반복문용 변수. 가장 작은 수가 여러개 일 수 있기 때문에 사용
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            
            answer[index++] = arr[i];
        }

        
        return answer;
    }
}
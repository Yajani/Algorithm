class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int sum = 0;
        int num =0;
        for(int i =0; i<finished.length; i++){
            if(!finished[i]){
                sum++;
            }
        }
        String[] answer = new String[sum];
        
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer[num] = todo_list[i];
                num++;
            }
        }
        return answer;
    }
}
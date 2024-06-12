class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
           String[] str = Integer.toString(array[i]).split("");
            for(String s :str){
                if(s.equals("7")){
                    answer++;
                }
            }  
        }
        return answer;
    }
}
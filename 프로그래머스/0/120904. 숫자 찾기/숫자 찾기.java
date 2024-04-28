class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] num2 = Integer.toString(num).split("");
        for(int i =0 ; i< num2.length; i++){
            if(num2[i].equals(Integer.toString(k))){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
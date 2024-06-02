class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i ; a <= j; a++){
            String[] s = Integer.toString(a).split("");
            for(String s1 : s){
                if(s1.equals(Integer.toString(k))){
                    answer++;
                };
            }
        }
        return answer;
    }
}
class Solution {
    public String[] solution(String[] names) {
        int len = 0;
        if(names.length % 5 == 0 )
            len = names.length / 5;
        else
            len = names.length / 5 + 1;
        int count = 0;
        String[] answer = new String[len];
        for(int i =0; i<names.length; i+=5){
            answer[count] = names[i];
            count++;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String str : order){
            if(str.contains("ice")){
                if(str.contains("americano")){
                    answer += 4500;
                }else{
                    answer += 5000;
                }
            }else if(str.contains("hot")){
                if(str.contains("americano")){
                    answer += 4500;
                }else{
                    answer += 5000;
                }
            }else{
                if(str.contains("americano")){
                    answer+= 4500;
                }else if(str.contains("latte")){
                    answer += 5000;
                }else{
                    answer += 4500;
                }
            }
        }
        return answer;
    }
}
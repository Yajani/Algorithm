class Solution {
    public int solution(int a, int b) {
        
        if(Integer.parseInt(Integer.toString(a) + Integer.toString(b)) >= Integer.parseInt(Integer.toString(b) + Integer.toString(a)) ){
            return Integer.parseInt(Integer.toString(a) + Integer.toString(b));
            
        }else{
            return Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        }
        
    }
}
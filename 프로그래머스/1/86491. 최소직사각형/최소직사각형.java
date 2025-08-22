class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0; 
        
        for(int[] s : sizes){
            int a= Math.max(s[0],s[1]);
            int b= Math.min(s[0],s[1]);
            if(a > maxW) maxW = a;
            if(b > maxH) maxH = b;
            
        }
        
        return maxW * maxH;
    }
}
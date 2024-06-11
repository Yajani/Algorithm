class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean ans1 = (x1 || x2) ? true : false;
        boolean ans2 = (x3 || x4) ? true : false;
        
        
        return (ans1 && ans2) ? true: false;
    }
}
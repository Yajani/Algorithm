class Solution {
    public int solution(int[] box, int n) {
        // 각 몫들을 구해서 곱하면 직육면체에 채워지는 주사위의 개수를 알 수 있다.
        return  (box[0] / n) * (box[1] / n) * (box[2] / n); 
    }
}
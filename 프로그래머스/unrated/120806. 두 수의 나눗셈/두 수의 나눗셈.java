class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / num2 * 1000;
        // 산술 변환(usual arithmetic conversion)
         // 두 피연산자의 타입 중 더 큰 타입으로 일치시키는 것
        return (int)answer;
    }
}
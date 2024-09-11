class Solution {
    public int solution(int[] sides) {
        int bigValue = Math.max(sides[0], sides[1]);
        int smallValue = Math.min(sides[0], sides[1]);

        int lowLimit = bigValue - smallValue;
        int highLimit = bigValue + smallValue;

        return highLimit - lowLimit - 1;
    }
}

//import java.util.Arrays;
//
//class Solution {
//    public int solution(int[] sides) {
//        int answer = 0;
//        Arrays.sort(sides);
//
//        if (sides[2] < sides[0] + sides[1]) {
//            answer = 1;
//        } else {
//            answer = 2;
//        }
//        return answer;
//    }
//}
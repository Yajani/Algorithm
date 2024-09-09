class Solution {
    public int solution(int[] numbers, int k) {
        // Calculating the position after k throws
        int index = (2 * (k - 1)) % numbers.length;
        return numbers[index];
    }
}
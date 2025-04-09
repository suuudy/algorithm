class Solution {
    public int solution(int angle) {
        int answer = 0;
        return angle > 0 && angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 && angle < 180 ? 3 : 4;
    }
}
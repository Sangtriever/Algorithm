class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int checkRange = 2 * w + 1;
        int lastStation = -1;

        for (int station : stations) {
            int left = Math.max(station - w - 1, 0);
            int right = Math.min(station + w - 1, n - 1);
            int range = left - lastStation - 1;
            if (range > 0) {
                answer += (range - 1) / checkRange + 1;
            }
            lastStation = right;
        }

        if (lastStation < n - 1) {
            int range = n - lastStation - 1;
            answer += (range - 1) / checkRange + 1;
        }

        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int cnt = m;
        Arrays.sort(score);
        for (int i = score.length-1; i >= 0; i--) {
            cnt--;
            if(cnt == 0){
                cnt = m;
                answer += m * score[i];
            }
        }
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] list = new int[201];
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                    list[j+100]++;
            }
        }
        for (int i = 0; i < list.length; i++) {
            if(list[i] > 1){
                answer++;
            }
        }
        return answer;
    }
}
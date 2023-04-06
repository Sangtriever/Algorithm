import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int[] x = {1, -1, 0, 0}; // 차례대로 오 왼 아 위
        int[] y = {0, 0, -1, 1};
        int[] max = {board[0]/2,board[1]/2};

        for (String s : keyinput) {
            int num = switch (s) {
                case "right" -> 0;
                case "left" -> 1;
                case "down" -> 2;
                default -> 3;
            };
            answer[0] += x[num];
            answer[1] += y[num];
            if (Math.abs(answer[0]) > Math.abs(max[0])) {
                if(answer[0] > 0) {
                    answer[0] = max[0];
                }else{
                    answer[0] = -max[0];
                }
            }
            if (Math.abs(answer[1]) > Math.abs(max[1])) {
                if(answer[1] > 0) {
                    answer[1] = max[1];
                }else{
                    answer[1] = -max[1];
                }
            }
        }

        return answer;
    }
}
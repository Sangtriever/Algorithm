import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int target = commands[i][2];
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = start; j < end; j++) {
                list.add(array[j]);
                Collections.sort(list);
            }
            answer[i] = list.get(target-1);
        }
        return answer;
    }
}
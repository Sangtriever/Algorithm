import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList<Integer> rank = new ArrayList<>();
        for (int i = 0; i < emergency.length; i++) {
            rank.add(emergency[i]);
        }
        rank.sort(Collections.reverseOrder());
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = rank.indexOf(emergency[i])+1;
        }
        return answer;
    }
}

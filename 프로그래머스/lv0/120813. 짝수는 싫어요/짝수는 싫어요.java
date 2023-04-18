import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i = i+2) {
            arrayList.add(i);
        }
        answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
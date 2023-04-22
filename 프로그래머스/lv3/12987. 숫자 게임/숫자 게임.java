import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        Queue<Integer> aq = new LinkedList<>();
        Queue<Integer> bq = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            aq.add(A[i]);
            bq.add(B[i]);
        }
        while (!aq.isEmpty() && !bq.isEmpty()) {
            if (aq.peek() >= bq.peek()) {
                bq.poll();
            } else {
                answer++;
                aq.poll();
                bq.poll();
            }
        }
        return answer;
    }
}
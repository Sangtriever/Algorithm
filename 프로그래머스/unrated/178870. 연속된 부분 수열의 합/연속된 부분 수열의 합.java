import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0,1000000000};
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            sum += sequence[i];
            q.add(i);
            while (sum > k && !q.isEmpty()){
                sum -= sequence[q.poll()];
            }
            if(sum == k){
                int left = q.peek();
                int right = q.size() + q.peek()-1;

                if(answer[1]-answer[0] > right - left){
                    answer[0] = left;
                    answer[1] = right;
                }
            }
        }
        return answer;
    }
}
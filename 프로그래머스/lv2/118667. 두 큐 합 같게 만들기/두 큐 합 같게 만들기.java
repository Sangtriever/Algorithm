import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long q1Sum = 0;
        long q2Sum = 0;
        long sum = 0;

        for (int i = 0; i < queue2.length; i++) {
            sum += queue1[i]+queue2[i];
            q1.add(queue1[i]);
            q1Sum += queue1[i];
            q2.add(queue2[i]);
            q2Sum += queue2[i];

        }
        sum /= 2;
        int maxCycle = queue1.length*3;
        while (q1Sum != q2Sum){
            maxCycle--;
           if(q1Sum > q2Sum){
               q2Sum += q1.peek();
               q1Sum -= q1.peek();
               q2.add(q1.poll());
               answer++;
           }else {
               q1Sum += q2.peek();
               q2Sum -= q2.peek();
               q1.add(q2.poll());
               answer++;
           }
           if(maxCycle == 0){
               return -1;
           }
        }
        return answer;
    }
}
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue<Integer> minQ= new PriorityQueue<>();
        Queue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < operations.length; i++) {

            char c = operations[i].charAt(0);
            int num = Integer.parseInt(operations[i].split(" ")[1]);

            if(c == 'I'){
                maxQ.add(num);
                minQ.add(num);
            }else{
                if(maxQ.size() == 0 && minQ.size() ==0) continue;
                if(num == 1){
                    int pollNum = maxQ.poll();
                    minQ.remove(pollNum);
                }else{
                    int pollNum = minQ.poll();
                    maxQ.remove(pollNum);
                }
            }
        }

        if(maxQ.size() == 0 && minQ.size() == 0){
            return new int[]{0,0};
        }else{
            answer[0] = maxQ.peek();
            answer[1] = minQ.peek();
        }
        return answer;
    }
}
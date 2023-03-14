import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> s = new Stack<>(); // Auxiliary container belt
        int index = 0;
        for (int i = 1; i <= order.length; i++) {
            if(order[index] == i){
                answer++;
                index++;
            }else {
                s.push(i);
            }
            while (!s.isEmpty() && s.peek() == order[index]){
                index++;
                answer++;
                s.pop();
            }
        }
        return answer;
    }
}
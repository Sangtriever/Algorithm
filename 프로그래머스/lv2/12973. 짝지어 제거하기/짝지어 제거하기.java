import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if (stack.size() > 1) {
                if (stack.get(stack.size() - 1).equals(stack.get(stack.size() - 2))) {
                    stack.pop();
                    stack.pop();
                }
            }
        }
        if(stack.size() == 0){
            answer = 1;
        }
        return answer;
    }
}
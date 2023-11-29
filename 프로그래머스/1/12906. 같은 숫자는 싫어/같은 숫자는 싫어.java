import java.util.Arrays;
import java.util.Stack;

class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != stack.peek()) stack.add(arr[i]);
        }

        return stack;
    }
}
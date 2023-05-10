import java.util.Stack;

class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1]+1;
            Stack<Character> stack = new Stack<>();
            for (int j = start; j < end; j++) {
                stack.push(my_string.charAt(j));
            }
            StringBuilder s = new StringBuilder();
            while (!stack.isEmpty()){
                s.append(stack.pop());
            }
            my_string = my_string.substring(0,start) + s.toString() + my_string.substring(end,my_string.length());
        }
        return my_string;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if(stk.isEmpty() || stk.peek() != arr[i]){
                stk.push(arr[i]);
            }else{
                stk.pop();
            }
        }
        if(stk.isEmpty()) return new int[]{-1};
        int[] answer = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++) {
            answer[i] = stk.get(i);
        }

        return answer;
    }
}
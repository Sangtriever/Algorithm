import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] list = Integer.toString(n).toCharArray();
        for (int i = 0; i< list.length; i++) {
            answer += Integer.parseInt(String.valueOf(list[i]));
        }
        return answer;
    }
}
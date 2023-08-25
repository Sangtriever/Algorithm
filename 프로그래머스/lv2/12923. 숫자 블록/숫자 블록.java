import java.util.*;

class Solution {

    public int[] solution(long begin, long end1) {
        int start = (int) begin;
        int end = (int) end1;
        int[] answer = new int[(end - start) + 1];
        int idx = 0;

        for (int now = start; now < end + 1; now++) {
            answer[idx++] = sol(now);
        }
        if (start == 1) {
            answer[0] = 0;
        }
        return answer;
    }

    public int sol(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if(n / i <= 10000000){
                    return n/i;
                }
            }
        }
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        return 1;
    }
}
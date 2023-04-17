import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, Comparator.comparingInt(o1 -> o1[1]));
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < routes.length; i++) {
            if(q.isEmpty() || q.peek() < routes[i][0]) q.add(routes[i][1]);
        }
        return q.size();
    }
}
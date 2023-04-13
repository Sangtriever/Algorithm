import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] time = new int[book_time.length][book_time[0].length];
        for (int i = 0; i < book_time.length; i++) {
            time[i] = new int[]{stringToTime(book_time[i][0]) , stringToTime(book_time[i][1]) + 10};
        }
        Arrays.sort(time, Comparator.comparingInt(o1 -> o1[0]));
        System.out.println(Arrays.deepToString(time));
        Queue<Integer> q = new PriorityQueue<>();
        q.add(time[0][1]);
        for (int i = 1; i < time.length; i++) {
            if(q.peek() <= time[i][0]){
                q.add(time[i][1]);
                q.poll();
            }else{
                q.add(time[i][1]);
            }
        }
        return q.size();
    }
    protected int stringToTime(String s){
        return (Integer.parseInt(s.split(":")[0])*60) + Integer.parseInt(s.split(":")[1]);
    }
}
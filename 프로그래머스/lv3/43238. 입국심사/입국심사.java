import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        Arrays.sort(times);
        long left = times[0];
        long right = (long)n * times[times.length-1];
        long mid = 0;
        long sum = 0;
        while(left<=right) {
            mid=  (left+right)/2;
            sum = 0;
            for(int time : times) {
                sum+= mid/time;
            }

            if(sum>=n) {
                answer = Math.min(answer, mid);
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if(sum == n){
                    answer++;
                }
                if(sum > n){
                    break;
                }
            }
        }
        return answer+1;
    }
}
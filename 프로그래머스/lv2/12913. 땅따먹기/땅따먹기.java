class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][land[0].length];
        for (int i = 0; i < land[0].length; i++) {
            dp[0][i] = land[0][i];
        }
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                for (int k = 0; k < land[i].length; k++) {
                    if(j != k){
                        dp[i][j] = Math.max(dp[i][j], land[i][j] + dp[i-1][k]);
                    }
                }
            }
        }
        for (int i = 0; i < dp[0].length; i++) {
            if(answer < dp[land.length-1][i]){
                answer = dp[land.length-1][i];
            }
        }
        return answer;
    }
}
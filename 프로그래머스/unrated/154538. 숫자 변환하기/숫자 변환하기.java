import java.util.*;
class Solution {
    public static int solution(int x, int y, int n) {
        if (y < x || n >= y) {
            return -1; // y를 만들 수 없는 경우
        }

        int[] dp = new int[y + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); // 초기값을 최댓값으로 설정

        dp[x] = 0; // x는 변환할 필요가 없으므로 연산 횟수는 0

        for (int i = x + 1; i <= y; i++) {
            if (i % 2 == 0 && dp[i / 2] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0 && dp[i / 3] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            if (i - n >= x && dp[i - n] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i - n] + 1);
            }
        }

        if (dp[y] != Integer.MAX_VALUE) {
            return dp[y]; // dp[y]값이 최댓값이 아니라면 dp[y]를 반환
        } else {
            return -1; // y를 만들 수 없는 경우 -1을 반환
        }
    }
}
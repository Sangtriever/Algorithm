class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] map = new int[n][m];
        for (int i = 0; i < puddles.length; i++) {
            map[puddles[i][1]-1][puddles[i][0]-1]--;
        }
        for (int i = 0; i < map.length; i++) {

            for (int j = 0; j < map[i].length; j++) {
                if(i == 0 && j == 0) {
                    map[0][0] = 1;
                }

                // 가로 가는중 웅덩이가 나왔을 경우
                if(map[i][j] == -1) continue;
                if(i-1 >= 0 && map[i-1][j] != -1) map[i][j] += map[i-1][j] % 1000000007;
                if(j-1 >= 0 && map[i][j-1] != -1) map[i][j] += map[i][j-1] % 1000000007;
            }
        }
        return map[n-1][m-1] % 1000000007;
    }
}
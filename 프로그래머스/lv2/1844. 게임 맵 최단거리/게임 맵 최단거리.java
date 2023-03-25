import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        bfs(maps,visited);
        answer = visited[maps.length-1][maps[0].length-1];
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }
    public void bfs (int[][] maps, int[][] visited){
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {0,0,1,-1};
        int[] dy = {-1,1,0,0};
        visited[0][0] = 1;
        int x = 0;
        int y = 0;
        q.add(new int[]{x,y});

        while (!q.isEmpty()){
            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {
                x = now[0] + dx[i];
                y = now[1] + dy[i];

                if(x < maps.length && x >= 0 && y < maps[0].length && y >= 0){
                    if(visited[x][y] == 0 && maps[x][y] == 1){
                        visited[x][y] = visited[now[0]][now[1]] + 1;
                        q.add(new int[]{x,y});
                    }
                }
            }
        }
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    boolean[][] visited;
    int sum;
    public int[] solution(String[] maps) {
        visited = new boolean[maps.length][maps[0].length()];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < maps.length; i++) {
            sum = 0;
            for (int j = 0; j < maps[0].length(); j++) {
                bfs(i,j,maps);
                if(sum != 0){
                    list.add(sum);
                    sum = 0;
                }
            }
        }
        if(list.size() == 0){
            return new int[]{-1};
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    public void bfs (int x, int y,String[] maps){
        if(x < maps.length && y < maps[0].length() && x >= 0 && y >= 0){
            if(!visited[x][y] && maps[x].charAt(y) != 'X'){
                visited[x][y] = true;
                sum += maps[x].charAt(y) - '0';
            }else{
                return;
            }
            bfs(x+1,y,maps);
            bfs(x,y+1,maps);
            bfs(x-1,y,maps);
            bfs(x,y-1,maps);
        }

    }
}
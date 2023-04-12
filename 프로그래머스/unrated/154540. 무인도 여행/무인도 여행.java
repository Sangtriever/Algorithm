import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    boolean[][] visited;
    int sum;
    public int[] solution(String[] maps) {
        // 방문했는지 체크용 2차 배열
        visited = new boolean[maps.length][maps[0].length()];
        // 모두 합한 값이 나올때 마다 추가 해 주기 위한 list
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < maps.length; i++) {
            sum = 0;
            for (int j = 0; j < maps[0].length(); j++) { 
                // 각 숫자마자 돌며 visited가 false이고, X가 아니라면 sum에 +
                bfs(i,j,maps);
                if(sum != 0){
                    list.add(sum);
                    sum = 0;
                }
            }
        }
        if(list.size() == 0){ // 숫자가 없다면 -1 리턴
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
        // 배열 크기 안에 들어올때
        if(x < maps.length && y < maps[0].length() && x >= 0 && y >= 0){
            // 방문한적 없고, X가 아닐때
            if(!visited[x][y] && maps[x].charAt(y) != 'X'){
                visited[x][y] = true;
                sum += maps[x].charAt(y) - '0';
            }else{
                return;
            }
            // 사방으로 해당사항 있는지 체크
            bfs(x+1,y,maps);
            bfs(x,y+1,maps);
            bfs(x-1,y,maps);
            bfs(x,y-1,maps);
        }

    }
}
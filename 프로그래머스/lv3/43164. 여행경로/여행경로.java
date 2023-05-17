import java.util.*;

class Solution {
    Queue<String> pq = new PriorityQueue<>();
    boolean[] visited;
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        dfs(tickets,"ICN",0,"ICN");
        String s = pq.peek();
        String[] answer = s.split(" ");
        return answer;
    }
    private void dfs (String[][] tickets, String nowCity, int cnt,String totalCity){
        if(cnt == tickets.length){
            pq.add(totalCity);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            if(!visited[i] && tickets[i][0].equals(nowCity)){
                visited[i] = true;
                dfs(tickets,tickets[i][1],cnt+1,totalCity + " " + tickets[i][1]);
                visited[i] = false;
            }
        }
    }
}
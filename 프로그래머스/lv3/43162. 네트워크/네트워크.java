class Solution {
    boolean[] visited;  // 방문 여부를 저장할 배열

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];  // 방문 배열 초기화

        // 모든 컴퓨터를 순회하면서 네트워크 개수를 구합니다.
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(computers, i);  // BFS를 통해 연결된 컴퓨터를 탐색합니다.
                answer++;  // 네트워크 개수를 증가시킵니다.
            }
        }

        return answer;
    }

    // BFS를 사용하여 연결된 컴퓨터를 탐색하는 메서드
    private void bfs(int[][] computers, int start) {
        for (int i = 0; i < computers[start].length; i++) {
            if (start == i) continue;  // 자기 자신은 제외합니다.
            if (computers[start][i] == 1 && !visited[i]) {
                visited[i] = true;  // 방문 처리를 합니다.
                bfs(computers, i);  // 연결된 컴퓨터를 재귀적으로 탐색합니다.
            }
        }
    }
}

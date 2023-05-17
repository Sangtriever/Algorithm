class Solution {
    int answer;
    boolean[] visited;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        dfs(begin,target,words,0);
        return answer;
    }

    public void dfs (String now, String target, String[] word,int cnt){
        if(now.equals(target)){
            answer = cnt;
            return;
        }
        for (int i = 0; i < word.length; i++) {
            if(visited[i]) continue;
            int same = 0;
            for (int j = 0; j < now.length(); j++) {
                if(now.charAt(j) == word[i].charAt(j)){
                    same++;
                }
            }
            if(same == now.length()-1){
                visited[i] = true;
                dfs(word[i],target,word,cnt + 1);
                visited[i] = false;
            }

        }
    }
}
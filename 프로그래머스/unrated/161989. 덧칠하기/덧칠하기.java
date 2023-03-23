class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int line = 0;

        for (int i = 0; i < section.length; i++) {
            if(line <= section[i]){
                line = section[i] + m;
                answer++;
            }
            
        }
        return answer;
    }
}
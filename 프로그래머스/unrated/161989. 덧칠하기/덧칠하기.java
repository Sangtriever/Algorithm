class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] line = new int[n];
        for (int i = 0; i < section.length; i++) {
            if(section[i] != 0){
                line[section[i]-1] = 1;
            }
        }

        for (int i = 0; i < line.length; i++) {
            if(line[i] != 0){
                for (int j = i; j < Math.min(line.length,i+m); j++) {
                    line[j] = 0;
                }
                answer++;
                i += m-1;
            }
        }
        return answer;
    }
}
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] front = t.split("");
        int[] frontint = new int[front.length];
        Long backint = Long.valueOf(p);
        for (int i = 0; i < front.length-p.length()+1; i++) {
            String result = "";
            for (int j = i; j < p.length()+i; j++) {
                result += front[j];
            }
            if(Long.parseLong(result) <= backint){
                answer++;  
            }
        }
        return answer;
    }
}
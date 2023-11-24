class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            boolean check = true;
            for (int j = 0; j < p.length(); j++) {
                int front = t.charAt(i+j)-'0';
                int back = p.charAt(j)-'0';
                if (front > back) {
                    check = false;
                    break;
                } else if (front < back){
                    break;
                }
            }
            if(check) answer++;
        }
        return answer;
    }
}
class Solution {
    public int solution(int l, int r) {
        int answer = 0;
        int cnt = 0;
        for (int i = l; i < r+1; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(j*j == i) {
                    cnt++;
                } else if (i % j == 0) {
                   cnt += 2;
                }
            }
            if(cnt%2 == 0){
                answer += i;
            }else {
                answer -= i;
            }
            cnt = 0;
        }
        return answer;
    }
}
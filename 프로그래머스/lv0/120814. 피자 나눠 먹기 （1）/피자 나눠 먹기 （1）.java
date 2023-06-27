class Solution {
    public int solution(int n) {
        int answer = 0;
        answer += n/7;
        n -= answer*7;
        if(n > 0 && n % 7 != 0){
            answer++;
        }
        return answer;
    }
}
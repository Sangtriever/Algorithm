class Solution {
    long answer = 0;
    public long solution(int a, int b) {
        if(a > b){
            int num = b;
            b = a;
            a = num;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}
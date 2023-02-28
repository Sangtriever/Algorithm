class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        if(a > b){
            int c = a;
            a = b;
            b = c;
        }
        double aa = 0.0;
        double bb = 0.0;
        while (true){
            answer++;
            if(b-a == 1 && b % 2 == 0){
                return answer;
            }
            aa = (double)a/2;
            bb = (double)b/2;
            a = (int) Math.round(aa);
            b = (int) Math.round(bb);
            n /= 2;
        }
    }
}
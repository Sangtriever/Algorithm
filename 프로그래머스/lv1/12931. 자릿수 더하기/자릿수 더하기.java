class Solution {
    public int solution(int n) {
        int answer = 0;
        int length = (int)(Math.log10(n)+1);
        int a =(int) Math.pow(10, length-1);
        for (int i = 0; i < length ; i++) {
            answer += n/a;
            n = n%a;
            a /= 10;
        }
        return answer;
    }
}
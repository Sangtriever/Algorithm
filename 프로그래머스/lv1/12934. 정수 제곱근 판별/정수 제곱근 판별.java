class Solution {
    public long solution(long n) {
        long answer = 0;
        double result = Math.pow(n,0.5);
        System.out.println(result);
        if(result%1 == 0 ){
            answer = ((long)result+1)*((long)result+1);
        }else{
            answer =-1;
        }
        System.out.println(answer);
        return answer;
    }
}
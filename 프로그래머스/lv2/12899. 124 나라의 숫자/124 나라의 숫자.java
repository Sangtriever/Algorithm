class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int[] num = {0,1,2,4};

        while (n > 0){
            if(n % 3 == 0){
                answer.append("4");
                n = (n-1)/3;
            }else {
                answer.append(num[n % 3]);
                n /= 3;
            }
        }
        return answer.reverse().toString();
    }
}
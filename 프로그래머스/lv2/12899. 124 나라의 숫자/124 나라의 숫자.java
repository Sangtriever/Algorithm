class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int[] num = {0,1,2,4};

        while (n > 3){
            if(n % 3 == 0){
                answer.append("4");
                n = (n-1)/3;
            }else {
                answer.append(Integer.toString(num[n % 3]));
                n /= 3;
            }
        }
        if(n == 1){
            answer.append("1");
        }else if (n == 2){
            answer.append("2");
        }else if(n == 3){
            answer.append("4");
        }
        return answer.reverse().toString();
    }
}
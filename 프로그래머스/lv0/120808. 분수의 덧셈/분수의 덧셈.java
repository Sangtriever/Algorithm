class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {0, 0};
        int top = num1 * denum2 + num2 * denum1;
        int bottom = num1 * num2;
        int lcm = 1;
        for(int i = 1; i <= bottom && i <= top; i++) {
            if(bottom%i == 0 && top%i == 0) lcm = i;
        }
        answer[0] = top / lcm;
        answer[1] = bottom / lcm;
        return answer;
    }
}
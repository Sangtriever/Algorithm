import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int min = cal(n,m);
        int max = n*m/min;
        return new int[]{min,max};
    }
    public int cal(int num1, int num2) {
        if (num2 == 0) return num1;
        return cal (num2, num1%num2);
    }
}
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int s) {
        if(n > s) return new int[]{-1};

        int[] list = new int[n];
        Arrays.fill(list, s / n);
        int num = s%n;
        for (int i = list.length-1; i >= 0; i--) {
            if (num > 0){
                list[i] += 1;
                num--;
            }else{
                break;
            }
        }
        return list;
    }
}
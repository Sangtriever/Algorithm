import java.util.Arrays;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = -100;
        int cnt = total/2;
        while (sum != total){
            sum = 0;
            for (int i = 0; i < num; i++) {
                sum += cnt+i;
            }
            if(sum > total){
                cnt--;
            }else if (sum < total){
                cnt++;
            }
            System.out.println(cnt);
            System.out.println(sum);
            System.out.println(total);
            System.out.println();
        }
        for (int i = 0; i < num; i++) {
            answer[i] = cnt+i;
        }
        return answer;
    }
}
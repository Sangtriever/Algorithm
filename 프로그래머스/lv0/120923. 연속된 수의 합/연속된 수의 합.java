import java.util.Arrays;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int cnt = total/2;
        while (true){
            int sum = 0;
            for (int i = 0; i < num; i++) {
                sum += cnt+i;
            }
            if(sum > total){
                cnt--;
            }else if (sum < total){
                cnt++;
            }else{
                break;
            }

        }
        for (int i = 0; i < num; i++) {
            answer[i] = cnt+i;
        }
        return answer;
    }
}

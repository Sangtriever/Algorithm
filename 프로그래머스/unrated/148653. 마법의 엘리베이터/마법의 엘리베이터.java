import java.util.Arrays;

class Solution {
    public int solution(int storey) {
        int answer = 0;
        String s = String.valueOf(storey);
        int[] list = new int[s.length()];
        for (int i = s.length()-1; i >= 0; i--) {
            int num = s.charAt(i) - '0';
            list[i]= num;
        }
        int cnt = 0;
        for (int i = list.length-1; i > 0; i--) {
            if(list[i] >= 6){
                cnt += 10-list[i];
                list[i-1]++;
            }else if (list[i] < 5){
                cnt += list[i];
            }else{
                if(list[i-1] < 5){
                    cnt += list[i];
                }else{
                    cnt += 10 - list[i];
                    list[i-1]++;
                }
            }
        }
        if(list[0] > 5){
            cnt += 11 - list[0];
        }else{
            cnt += list[0];
        }
        System.out.println(Arrays.toString(list));
        return cnt;
    }
}
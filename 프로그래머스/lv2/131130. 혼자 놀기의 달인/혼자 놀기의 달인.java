import java.util.Arrays;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        boolean[] check;
        boolean[] secondCheck;
        for (int i = 0; i < cards.length; i++) {
            cards[i]--;
        }
        for (int i = 0; i < cards.length; i++) {
            check = new boolean[cards.length];
            int idx = i;
            int left = 0;
            int right = 0;
            int cnt = 0;
            while (!check[idx]){
                cnt++;
                check[idx] = true;
                idx = cards[idx];
            }
            left = cnt;
            System.out.println(Arrays.toString(check));
            for (int j = i+1; j < cards.length; j++) {
                secondCheck = check;
                idx = j;
                cnt = 0;
                while (!check[idx]){
                    cnt++;
                    secondCheck[idx] = true;
                    idx = cards[idx];
                }
                right = Math.max(right,cnt);
            }
            System.out.println(left);
            System.out.println(right);
            System.out.println();
            answer = Math.max(answer,left * right);
        }
        return answer;
    }
}
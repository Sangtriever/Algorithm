import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Arrays.sort(tangerine);
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 1;
        for (int i = 1; i < tangerine.length; i++) {
            if(tangerine[i] == tangerine[i-1]){
                cnt++;
            }else{
                list.add(cnt);
                cnt = 1;
            }
        }
        list.add(cnt);
        list.sort(Comparator.reverseOrder());
        cnt = 0;

        for (Integer integer : list) {
            answer += integer;
            cnt++;

            if (k <= answer) {
                return cnt;
            }
        }
        return cnt;
    }
}
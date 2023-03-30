import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            hashMap.put(tangerine[i],hashMap.getOrDefault(tangerine[i],0)+1);
        }
        List<Integer> list = new ArrayList<>(hashMap.values());
        list.sort(Comparator.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            k -= list.get(i);
            if(k <= 0){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
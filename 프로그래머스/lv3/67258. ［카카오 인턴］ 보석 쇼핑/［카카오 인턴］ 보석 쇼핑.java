import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = {1, gems.length};
        Map<String, Integer> map = new HashMap<>();
        for (String gem : gems) {
            map.put(gem, map.getOrDefault(gem, 0) + 1);
        }
        int start = 0, end = 0, size = map.size();
        Map<String, Integer> shopping = new HashMap<>();
        shopping.put(gems[0], 1);
        while (start < gems.length && end < gems.length) {
            if (shopping.size() == size) {
                if (end - start < answer[1] - answer[0]) {
                    answer[0] = start + 1;
                    answer[1] = end + 1;
                }
                shopping.put(gems[start], shopping.get(gems[start]) - 1);
                if (shopping.get(gems[start]) == 0) {
                    shopping.remove(gems[start]);
                }
                start++;
            } else {
                end++;
                if (end == gems.length) {
                    break;
                }
                shopping.put(gems[end], shopping.getOrDefault(gems[end], 0) + 1);
            }
        }
        return answer;
    }
}
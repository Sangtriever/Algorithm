import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (String value : keymap) {
            char[] s = value.toCharArray();
            for (int j = 0; j < s.length; j++) {
                if (!hashMap.containsKey(s[j])) {
                    hashMap.put(s[j], j + 1);
                }
                if (hashMap.containsKey(s[j]) && hashMap.get(s[j]) > j + 1) {
                    hashMap.put(s[j], j + 1);
                }
            }
        }
        root :
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                if(!hashMap.containsKey(targets[i].charAt(j))){
                    answer[i] = -1;
                    continue root;
                }
                sum += hashMap.get(targets[i].charAt(j));
            }
            answer[i] = sum;
        }
        return answer;
    }
}
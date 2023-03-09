import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        for (String value : keymap) {
            char[] s = value.toCharArray();
            for (int j = 0; j < s.length; j++) {        // 알파벳에 HashMap을 써서 각각의 숫자를 넣기
                
                if (!hashMap.containsKey(s[j])) {       // 처음 들어오는 알파벳이면 넣기
                    hashMap.put(s[j], j + 1);
                }
                
                if (hashMap.containsKey(s[j]) && hashMap.get(s[j]) > j + 1) { // 이미 있는 알파벳이면, 비교해서 작은 숫자로 적용
                    hashMap.put(s[j], j + 1);
                }
            }
        }
        
        root :
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            
            for (int j = 0; j < targets[i].length(); j++) {
                if(!hashMap.containsKey(targets[i].charAt(j))){ // 만약 해당 알파벳이 없다면 -1 반환
                    answer[i] = -1;
                    continue root;
                }
                sum += hashMap.get(targets[i].charAt(j));   // 해당 알파벳 숫자 찾아서 더하기
            }
            answer[i] = sum;
        }
        return answer;
    }
}
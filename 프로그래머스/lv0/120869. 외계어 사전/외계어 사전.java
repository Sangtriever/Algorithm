import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<String> uniqueChars = new HashSet<>();
        for (String s : spell) {
            uniqueChars.add(s);
        }
        for (String word : dic) {
            Set<String> wordChars = new HashSet<>();
            for (char c : word.toCharArray()) {
                wordChars.add(String.valueOf(c));
            }
            if (wordChars.containsAll(uniqueChars)) {
                return 1;
            }
        }
        return 2;
    }
}

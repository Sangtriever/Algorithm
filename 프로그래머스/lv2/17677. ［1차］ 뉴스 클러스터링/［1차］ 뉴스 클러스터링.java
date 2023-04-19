import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        Map<String, Integer> s1 = new HashMap<>();
        Map<String, Integer> s2 = new HashMap<>();

        // 문자열을 2글자씩 나누어서 다중집합 생성
        for (int i = 0; i < str1.length() - 1; i++) {
            char c1 = str1.charAt(i), c2 = str1.charAt(i + 1);
            if (c1 < 'A' || c1 > 'Z' || c2 < 'A' || c2 > 'Z') {
                continue;
            }
            String subset = str1.substring(i, i + 2);
            s1.put(subset, s1.getOrDefault(subset, 0) + 1);
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            char c1 = str2.charAt(i), c2 = str2.charAt(i + 1);
            if (c1 < 'A' || c1 > 'Z' || c2 < 'A' || c2 > 'Z') {
                continue;
            }
            String subset = str2.substring(i, i + 2);
            s2.put(subset, s2.getOrDefault(subset, 0) + 1);
        }

        // 합집합 생성
        Map<String, Integer> union = new HashMap<>(s1);
        for (Map.Entry<String, Integer> entry : s2.entrySet()) {
            String subset = entry.getKey();
            int count2 = entry.getValue();
            if (union.containsKey(subset)) {
                int count1 = union.get(subset);
                union.put(subset, Math.max(count1, count2));
            } else {
                union.put(subset, count2);
            }
        }

        // 교집합 생성
        Map<String, Integer> intersection = new HashMap<>();
        for (Map.Entry<String, Integer> entry : s1.entrySet()) {
            String subset = entry.getKey();
            int count1 = entry.getValue();
            if (s2.containsKey(subset)) {
                int count2 = s2.get(subset);
                intersection.put(subset, Math.min(count1, count2));
            }
        }

        // 자카드 유사도 계산
        double jaccardSimilarity;
        int unionCount = 0, intersectionCount = 0;
        for (int count : union.values()) {
            unionCount += count;
        }
        for (int count : intersection.values()) {
            intersectionCount += count;
        }
        if (unionCount == 0) {
            jaccardSimilarity = 1.0;
        } else {
            jaccardSimilarity = (double) intersectionCount / unionCount;
        }

        return (int) (jaccardSimilarity * 65536);
    }
}

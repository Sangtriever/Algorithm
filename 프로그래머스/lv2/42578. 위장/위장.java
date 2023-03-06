import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> clothesHashMap = new HashMap<>();
//        System.out.println(clothesHashMap);
        for (int i = 0; i < clothes.length; i++) {
            clothesHashMap.putIfAbsent(clothes[i][1], 0);
            clothesHashMap.put(clothes[i][1],clothesHashMap.get(clothes[i][1])+1);
        }
        int sum = 1;
        for(String key : clothesHashMap.keySet()){
            sum *= clothesHashMap.get(key)+1;
        }
        answer = sum - 1;
        return answer;
    }
}
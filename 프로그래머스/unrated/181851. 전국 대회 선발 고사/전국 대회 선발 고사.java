import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> rankMap = new HashMap<>();
        Map<Integer, Boolean> cheak = new HashMap<>();

        // 랭킹과 출석 여부를 각각의 Map에 저장
        for (int i = 0; i < rank.length; i++) {
            rankMap.put(rank[i],i);
            cheak.put(rank[i],attendance[i]);
        }

        // 랭킹 기준 오름차순
        Arrays.sort(rank);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if(cheak.get(rank[i])) {
                list.add(rankMap.get(rank[i]));
                if(list.size() == 3) {
                    break;
                }
            }
        }

        // 세 명의 등수
        int first = list.get(0);
        int second = list.get(1);
        int third = list.get(2);

        return 10000 * first + 100 * second + third;
    }
}
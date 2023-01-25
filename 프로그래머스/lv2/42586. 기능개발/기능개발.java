import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            list.add(progresses[i]);
            list2.add(speeds[i]);
        }
        List<Integer> list3 = new ArrayList<>();
        while (true){
            int cnt = 0;
            while (list.get(0) < 100) {
                for (int i = 0; i < list.size(); i++) {
                    list.set(i, list.get(i)+list2.get(i));
                }
            }
            while (list.get(0) >= 100){
                cnt++;
                list.remove(0);
                list2.remove(0);
                if(list.size() == 0){
                    break;
                }
            }
            list3.add(cnt);
            if(list.size() == 0){
                break;
            }
        }
        int[] answer = new int[list3.size()];
        for (int i = 0; i < list3.size(); i++) {
            answer[i] = list3.get(i);
        }
        return answer;
    }
}
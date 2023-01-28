import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if(list.size() < k){
                list.add(score[i]);
                list.sort(Collections.reverseOrder());
                answer[i] = list.get(list.size()-1);
            }else{
                if(list.get(list.size()-1) < score[i]){
                    list.set(list.size()-1,score[i]);
                    if(list.get(list.size()-2) < list.get(list.size()-1)) {
                        list.sort(Collections.reverseOrder());
                    }
                }
                answer[i] = list.get(list.size()-1);
            }
        }
        return answer;
    }
}
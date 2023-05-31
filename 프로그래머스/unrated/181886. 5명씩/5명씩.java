import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        int cnt = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++){
            if(cnt == 0){
                list.add(names[i]);
                cnt = 5;
            }
            cnt--;
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
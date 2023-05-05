import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l") && cnt == 0){
                cnt++;
                break;
            }
            if(str_list[i].equals("r") && cnt == 0){
                cnt++;
                list = new ArrayList<>();
                continue;
            }
            list.add(str_list[i]);
        }
        if(cnt == 0) return new String[]{};
        String[] s = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            s[i] = list.get(i);
        }
        return s;
    }
}
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if(c == 'a' || c == 'b' || c == 'c') {
                if(sb.length() != 0){
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }
        if(sb.length() != 0){
            list.add(sb.toString());
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer.length !=0 ? answer : new String[]{"EMPTY"};
    }
}
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int cnt = 0;
        List<StringBuilder> stringList = new ArrayList<>();
        char a = s.charAt(0);
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == a){
                string.append(s.charAt(i));
                cnt++;
            }else{
                string.append(s.charAt(i));
                cnt--;
            }
            if(i == s.length()-1){
                stringList.add(string);
                break;
            }
            if(cnt == 0){
                stringList.add(string);
                a = s.charAt(i+1);
            }
        }
        answer = stringList.size();
        return answer;
    }
}
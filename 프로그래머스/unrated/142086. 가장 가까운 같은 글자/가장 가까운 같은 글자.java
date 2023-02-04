import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] az = new int[26];
        for (int i = 0; i < 26; i++) {
            az[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if(az[(int)s.charAt(i)-97] == -1){
                answer[i] = -1;
            }else{
                answer[i] = i-az[(int)s.charAt(i)-97];
            }
            az[(int)s.charAt(i)-97] = i;
        }
        return answer;
    }
}
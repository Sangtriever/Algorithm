import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroNum = 0;
        while (s.length() > 1){
            cnt++;
            zeroNum += s.length() - s.replace("0","").length();
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
        }
        answer[0] = cnt;
        answer[1] = zeroNum;
        return answer;
    }
}
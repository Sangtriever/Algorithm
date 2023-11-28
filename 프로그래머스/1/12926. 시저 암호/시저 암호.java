import java.util.Arrays;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] list = s.toCharArray();
        int num = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == ' ') {

            } else {
                if (list[i] > 64 && list[i] < 91) {
                    list[i] += n;
                    if (list[i] > 90) {
                        list[i] -= 26;
                    }
                } else {
                    list[i] += n;
                    if (list[i] > 122) {
                        list[i] -= 26;
                    }
                }
            }
            answer += list[i];
        }

        return answer;
    }
}
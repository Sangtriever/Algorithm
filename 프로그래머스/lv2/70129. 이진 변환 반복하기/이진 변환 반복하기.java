import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroNum = 0;
        while (s.length() > 1){             // s의 길이가 1일때까지 반복
            answer[0]++;  
            answer[1] += s.length() - s.replace("0","").length(); // 제거한 0의 갯수
            s = s.replace("0",""); // 0을 제거한 s
            s = Integer.toBinaryString(s.length()); // s = 0을 제거한 이진법의 길이를 이진법으로 바꾸기
        }
        return answer;
    }
}
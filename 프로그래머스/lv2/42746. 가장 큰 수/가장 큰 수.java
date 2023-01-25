import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] s = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            s[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        answer = String.join("",s);
        if(answer.compareTo("1") < 0){
            answer = "0";
        }
        return answer;
    }
}
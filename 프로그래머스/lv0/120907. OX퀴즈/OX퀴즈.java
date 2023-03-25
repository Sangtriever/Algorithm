import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            if(calculator(s)){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }

        return answer;
    }
    public boolean calculator(String[] s){
        if(s[1].equals("-")){
            return Integer.parseInt(s[0]) - Integer.parseInt(s[2]) == Integer.parseInt(s[4]);
        }else {
            return Integer.parseInt(s[0]) + Integer.parseInt(s[2]) == Integer.parseInt(s[4]);
        }
    }
}
import java.util.Arrays;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] list = s.split(" ");
        for (int i = list.length-1; i >= 0 ; i--) {
            if(list[i].equals("Z")){
                i--;
            }else{
                answer += Integer.parseInt(list[i]) ;
            }
        }
        return answer;
    }
}
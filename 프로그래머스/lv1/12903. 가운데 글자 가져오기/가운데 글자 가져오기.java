class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split("");
        int center = list.length/2;

        if(list.length % 2 == 0){ //짝수 = 가운데 2개
            for (int i = 0; i < list.length; i++) {
                if(i == center){
                    answer += list[i-1] + list[i];
                    System.out.println(answer);
                }
            }
        }
        else{ //홀수 = 가운데 1개
            for (int i = 0; i < list.length; i++) {
                if(i == center){
                    answer += list[i];
                    System.out.println(answer);
                }
            }
        }
        return answer;
    }
}
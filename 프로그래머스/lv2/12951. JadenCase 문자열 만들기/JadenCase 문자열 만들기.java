class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        char[] list = s.toCharArray();
        int idx = 0;
        for (int i = 0; i < list.length; i++) {
            if(idx == 0){
                if(list[i] > 96){
                    list[i] -= 32;
                }
                idx = 0;
            }
            idx++;
            if(list[i] == 32) idx = 0;
            answer += list[i];
        }
        return answer;
    }
}

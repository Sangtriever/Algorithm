class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] basic = {"aya", "ye", "woo", "ma"};
        for(String s : babbling){
            if(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")){
                continue;
            }
            for (int i = 0; i < basic.length; i++) {
                s = s.replace(basic[i],"!");
            }
            s = s.replace("!","");
            if(s.equals("")){
                answer++;
            }
        }
        return answer;
    }
}
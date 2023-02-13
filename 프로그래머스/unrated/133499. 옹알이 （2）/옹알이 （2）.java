class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] basicWord = {"aya", "ye", "woo", "ma"};
        for (String s : babbling) {
            if (s.contains("ayaaya")
                    || s.contains("yeye")
                    || s.contains("woowoo")
                    || s.contains("mama")) {
                continue;
            }
            for (int i = 0; i < basicWord.length; i++) {
                s = s.replace(basicWord[i],"!");
            }
            s = s.replace("!" , "");
            if(s.length() == 0){
                answer++;
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] sList = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < sList.length; i++){
            if(cnt == 0 && sList[i] > 90) sList[i] = (char) (sList[i]-32);
            if(cnt != 0 && sList[i] < 97 && sList[i] != ' ') sList[i] = (char) (sList[i]+32);
            cnt++;
            if(sList[i] == ' '){
                cnt = 0;
                answer.append((char) 32);
            }else{
                answer.append(sList[i]);
            }
        }
        return answer.toString();
    }
}
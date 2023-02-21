class Solution {
    public String solution(String s) {
        String answer = "";


        String[] sList = s.split(" ");
        int maxNum = Integer.parseInt(sList[0]);
        int minNum = Integer.parseInt(sList[0]);
        for (int i = 0; i < sList.length; i++) {
            if(minNum > Integer.parseInt(sList[i])){
                minNum = Integer.parseInt(sList[i]);
                continue;
            }
            if(maxNum < Integer.parseInt(sList[i])){
                maxNum = Integer.parseInt(sList[i]);
                continue;
            }
        }
        answer = minNum + " " + maxNum;
        return answer;
    }
}
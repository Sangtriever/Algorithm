import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sList = s.split(" ");
        int[] numList = new int[sList.length];
        for (int i = 0; i < sList.length; i++) {
            numList[i] = Integer.parseInt(sList[i]);
        }
        Arrays.sort(numList);
        System.out.println(Arrays.toString(numList));
        answer = numList[0] + " " + numList[numList.length-1];
        return answer;
    }
}
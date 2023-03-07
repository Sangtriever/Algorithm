import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] sList = s.split(" ");
        int[] numList = new int[sList.length];
        for (int i = 0; i < sList.length; i++) {
            numList[i] = Integer.parseInt(sList[i]);
        }
        Arrays.sort(numList);
        return numList[0] + " " + numList[numList.length-1];
    }
}
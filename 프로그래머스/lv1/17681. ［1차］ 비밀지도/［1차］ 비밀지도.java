import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        int[][] list1 = new int[arr1.length][arr1.length];
        int[][] list2 = new int[arr1.length][arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                list1[i][arr1.length-1-j] = arr1[i]%2;
                arr1[i] = arr1[i]/2;
                list2[i][arr1.length-1-j] = arr2[i]%2;
                arr2[i] = arr2[i]/2;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            String s = "";
            for (int j = 0; j < arr1.length; j++) {
                if (list1[i][j] + list2[i][j] == 0) {
                    s += " ";
                }else{
                    s += "#";
                }
            }
            answer[i] = s;
        }

        return answer;
    }
}
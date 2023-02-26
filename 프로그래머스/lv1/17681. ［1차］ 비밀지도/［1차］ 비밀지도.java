import java.util.Arrays;

public class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            String arr1BinaryString = Integer.toBinaryString(arr1[i]);
            String arr2BinaryString = Integer.toBinaryString(arr2[i]);

            arr1BinaryString = String.format("%" + n + "s", arr1BinaryString).replace(" ", "0");
            arr2BinaryString = String.format("%" + n + "s", arr2BinaryString).replace(" ", "0");

            char[] charlist1 = arr1BinaryString.toCharArray();
            char[] charlist2 = arr2BinaryString.toCharArray();
            answer[i] = "";
            for (int j = 0; j < charlist1.length; j++) {
                if (charlist1[j] == '1' || charlist2[j] == '1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}
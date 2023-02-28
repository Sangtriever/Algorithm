import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] arr1BinaryString = new String[arr1.length];
        String[] arr2BinaryString = new String[arr2.length];
        String[] resultBinaryString = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1BinaryString[i] = Integer.toBinaryString(arr1[i]);
            arr2BinaryString[i] = Integer.toBinaryString(arr2[i]);
            while (arr1BinaryString[i].length() < arr1.length){
                arr1BinaryString[i] = "0" + arr1BinaryString[i];
            }
            while (arr2BinaryString[i].length() < arr1.length){
                arr2BinaryString[i] = "0" + arr2BinaryString[i];
            }
            char[] charlist1 = arr1BinaryString[i].toCharArray();
            char[] charlist2 = arr2BinaryString[i].toCharArray();
            answer[i] = "";
            for (int j = 0; j < charlist1.length; j++) {
                if (charlist1[j] == '1' || charlist2[j] == '1') {
                    answer[i] += "#";
                }else {
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}

import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
           String arr1Binary = Integer.toBinaryString(arr1[i]);
           String arr2Binary = Integer.toBinaryString(arr2[i]);
            while (arr1Binary.length() < arr1.length){
                arr1Binary = "0" + arr1Binary;
            }
            while (arr2Binary.length() < arr1.length){
                arr2Binary = "0" + arr2Binary;
            }
            char[] charlist1 = arr1Binary.toCharArray();
            char[] charlist2 = arr2Binary.toCharArray();
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

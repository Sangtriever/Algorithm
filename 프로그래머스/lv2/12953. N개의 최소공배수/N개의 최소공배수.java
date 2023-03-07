import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int highNum = arr[arr.length-1];
        int cnt = highNum;
        roop : while (true){
            highNum += cnt;
            for (int i = 0; i < arr.length-1; i++) {
                if(highNum % arr[i] != 0){
                    break;
                }
                if(i == arr.length-2){
                    break roop;
                }
            }
        }
        return highNum;
    }
}
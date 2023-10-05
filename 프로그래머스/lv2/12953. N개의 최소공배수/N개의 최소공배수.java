import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int maxInt = arr[arr.length-1];
        int idx = 0;

        loop:
        while (true){
            answer = maxInt * ++idx;
            for (int i = 0; i < arr.length-1; i++) {
                if(answer % arr[i] != 0){
                    continue loop;
                }
            }
            break;
        }
        return answer;
    }
}
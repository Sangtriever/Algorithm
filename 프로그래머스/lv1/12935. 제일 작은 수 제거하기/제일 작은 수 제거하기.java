import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        // if (arr.length == 1) {
        //     return new int[]{-1};
        // }
        int[] answer = new int[arr.length-1];
        if(arr.length == 1){
            answer[0] = -1;
            return answer;
        }
        int minnum = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if(arr[i] < minnum){
                minnum = arr[i];
            }
        }
        // System.out.println(list);
        list.remove(Integer.valueOf(minnum));
        // System.out.println(list);
        for (int i = 0; i < list.size(); i++) {

            answer[i] = list.get(i);
        }
        // System.out.println(Arrays.toString(answer));
        return answer;
    }
}

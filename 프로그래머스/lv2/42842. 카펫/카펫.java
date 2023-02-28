import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = brown + yellow;
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                arrayList.add(i);
            }
        }
        if(arrayList.size() % 2 ==1){
            answer[0] = arrayList.get(arrayList.size()/2);
            answer[1] = arrayList.get(arrayList.size()/2);
            return answer;
        }
        for (int i = 0; i < arrayList.size()/2; i++) {
            if(Math.abs((arrayList.get(i)-2)*(arrayList.get(arrayList.size()-1-i)-2)) == yellow){
                answer[0] = arrayList.get(arrayList.size()-1-i);
                answer[1] = arrayList.get(i);
            }
        }
        return answer;
    }
}
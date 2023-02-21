import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        int todays = dayCur(today);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            hashMap.put(terms[i].charAt(0),Integer.parseInt(terms[i].substring(2))*28);
        }
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            int a = hashMap.get(privacies[i].charAt(11));
            int day = dayCur(privacies[i])+ a;
            if(todays >= day){
                answer.add(i+1);
            }
        }
        // int[] answer = new int[list.size()];
        // for (int i = 0; i < list.size(); i++) {
        //     answer[i] = list.get(i);
        // }
        return answer;
    }
    public int dayCur(String days){
        int year = 336 * Integer.parseInt(days.substring(0,4));
        int month = 28 * Integer.parseInt(days.substring(5,7));
        int day = Integer.parseInt(days.substring(8,10));
        return year + month + day;
    }
}
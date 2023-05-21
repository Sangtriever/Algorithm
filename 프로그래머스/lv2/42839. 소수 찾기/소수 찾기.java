import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    boolean[] check;
    List<String> allArr;

    public int solution(String numbers) {
        int answer = 0;
        check = new boolean[numbers.length()];
        allArr = new ArrayList<>();


        for (int i = 1; i <= numbers.length(); i++) {
            Numcombo("", numbers, i);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < allArr.size(); i++) {
            int num = Integer.parseInt(allArr.get(i));
            set.add(num);
        }

        for (Integer num : set) {
            if(sosu(num)) {
                System.out.println("소수 : " + num);
                answer++;
            }
        }
        return answer;
    }

    public void Numcombo(String temp, String numbers, int len) {
        if (temp.length() == len) {
            allArr.add(temp);
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (check[i]) continue;

            check[i] = true;
            Numcombo(temp + numbers.charAt(i), numbers, len);
            check[i] = false;
        }
    }

    public boolean sosu(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
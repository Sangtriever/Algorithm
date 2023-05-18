import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            list.add(numlist[i]-n);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)){
                        return o2 - o1;
                }else{
                    return Math.abs(o1)-Math.abs(o2);
                }
            }
        });
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] = list.get(i) + n;
        }
        return numlist;
    }
}
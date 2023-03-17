import java.util.HashSet;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] list1 = new int[topping.length+1];
        int[] list2 = new int[topping.length];
        for (int i = 0; i < topping.length; i++) {

            set1.add(topping[i]);
            list1[i+1] = set1.size();

            set2.add(topping[topping.length-1-i]);
            list2[topping.length-1-i] = set2.size();
        }
        for (int i = 0; i < list2.length; i++) {
            if(list2[i]==list1[i]){
                answer++;
            }
        }
        return answer;
    }
}
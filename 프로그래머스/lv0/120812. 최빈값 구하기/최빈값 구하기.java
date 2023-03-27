
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] list = new int[1001];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            list[array[i]]++;
            if(max < list[array[i]]){
                max = list[array[i]];
                answer = array[i];
            }
        }
        int cnt = 0;
        for (int i = 0; i < list.length; i++) {
            if(max == list[i]) cnt++;
            if(cnt > 1)return -1;
        }
        return answer;
    }
}
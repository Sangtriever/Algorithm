import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toUpperCase();
            if(queue.contains(s)){
                queue.remove(s);
                answer++;
            }else{
                answer += 5;
            }
            queue.add(s);
            if(queue.size() > cacheSize){
                queue.poll();
            }
        }
        return answer;
    }
}
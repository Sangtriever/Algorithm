import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 0;
        for (int i = 0; i < truck_weights.length; i++) {
            int t = truck_weights[i];
            while (true){
                if(queue.isEmpty()){ // queue가 비었을 경우, 가능 무게에서 트럭 무게를 빼고 시간을 1초 더한다
                    queue.add(t);
                    weight -= t;
                    time++;
                    break;
                }else if(queue.size() == bridge_length){ // 트럭이 끝까지 도달했을 경우, 도착 트럭을 빼고, 허용 가능 무게를 늘려준다
                    weight += queue.poll();
                }else {
                    if(weight >= t){                    // 다리에 트럭이 들어갈 수 있는경우, 추가
                        queue.add(t);
                        weight -=t;
                        time++;
                        break;
                    }else{                              // 다리에 트럭이 추가로 들어갈 수 없는경우, 공백 추가 무게는 0
                        queue.add(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length; // 마지막 차량이 끝까지 도달하기 위해서 다리 길이만큼 시간 추가
    }
}
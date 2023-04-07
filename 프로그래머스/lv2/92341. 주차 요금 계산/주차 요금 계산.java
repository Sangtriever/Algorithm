import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, String> timeMap = new HashMap<>();
        Map<String, Integer> carTotalTime = new LinkedHashMap<>();
        Map<String,Integer> carNumFee = new HashMap<>();
        List<String> numList = new ArrayList<>();
        for (int i = 0; i < records.length; i++) {
            String time = records[i].split(" ")[0];
            String num = records[i].split(" ")[1];
            String type = records[i].split(" ")[2];
            if(type.equals("IN")){
                if(!numList.contains(num)) {
                    numList.add(num);
                }
                timeMap.put(num,time);
            }else{
                carTotalTime.put(num, carTotalTime.getOrDefault(num,0)+timeConverter(timeMap.get(num),time));
                timeMap.remove(num);
            }
        }

        for (Map.Entry<String, String> pair : timeMap.entrySet()) {
            String num = pair.getKey();
            String time = pair.getValue();
            carTotalTime.put(num, carTotalTime.getOrDefault(num,0)+timeConverter(time,"23:59"));
        }
        for (Map.Entry<String, Integer> pair : carTotalTime.entrySet()) {
            carNumFee.put(pair.getKey(),timeTofee(fees, pair.getValue()));
        }
        Collections.sort(numList);
        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = carNumFee.get(numList.get(i));
        }
        return answer;
    }
    public int timeConverter (String start, String end){
        int startTime = Integer.parseInt(start.split(":")[0]) * 60 + Integer.parseInt(start.split(":")[1]);
        int endTime = Integer.parseInt(end.split(":")[0]) * 60 + Integer.parseInt(end.split(":")[1]);
        return endTime-startTime;
    }
    public int timeTofee(int[] fees, int time){
        int basicTime = fees[0]; // 180
        int basicFee = fees[1];  // 5000
        int unitTime = fees[2]; // 10
        int unitFee = fees[3]; // 600
        int fee = basicFee;
        if(time > basicTime){
            if((time-basicTime)%unitTime > 0){
                fee += unitFee;
            }
            fee += ((time - basicTime)/unitTime) * unitFee;
        }
        return fee;
    }
}
import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> reportSet = new HashSet<>(List.of(report)); // 중복 제거용
        List<String> reportList = new ArrayList<>(reportSet);
        Collections.sort(reportList);
        HashMap<String, Integer> reportCnt = new HashMap<>();    // 신고 횟수
        HashMap<String, List<String>> reportUser = new HashMap<>(); // 신고 유저 정보
        List<String> reportedList = new ArrayList<>();
        String name = reportList.get(0).split(" ")[0];
        for (String value : id_list) {
            reportCnt.put(value, 0);
        }
        for(String s : reportList){
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];
            reportCnt.put(reported,reportCnt.get(reported)+1);
            if(!reporter.equals(name)){
                reportUser.put(name,reportedList);
                name = reporter;
                reportedList = new ArrayList<>();
            }
            reportedList.add(reported);
        }
        reportUser.put(name,reportedList);
        for (int i = 0; i < id_list.length; i++) {
            if(reportUser.get(id_list[i]) != null){
                for (int j = 0; j < reportUser.get(id_list[i]).size(); j++) {
                    if(reportCnt.get(reportUser.get(id_list[i]).get(j)) >= k){
                        answer[i]++;
                    };
                }
            }
        }
        return answer;
    }
}
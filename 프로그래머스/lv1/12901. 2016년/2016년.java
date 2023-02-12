
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int day = b;
        for (int i = 1; i < a; i++) {
            if(a == 1){
                break;
            }
            if(i == 1||i==3|| i == 5|| i ==7 || i ==8||i==10||i==12){
                day+= 31;
            }else if(i == 2){
                day += 29;
            }else {
                day +=30;
            }
        }
        
        day = day % 7;
        if(day == 0){
            answer="THU";
        }else if(day == 1){
            answer="FRI";
        } else if (day == 2) {
            answer= "SAT";
        }else if(day == 3){
            answer = "SUN";
        }else if(day == 4){
            answer = "MON";
        }else if(day == 5){
            answer = "TUE";
        }else{
            answer = "WED";
        }
        System.out.println(answer);
        return answer;
    }
}

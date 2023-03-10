import java.util.Arrays;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50,50,0,0}; // x최소값, y 최소값, x최대값, y최대값

        for (int i = 0; i < wallpaper.length; i++) {
            String[] clist = wallpaper[i].split("");
            for (int j = 0; j < clist.length; j++) { // i = 세로y j = 가로x
                if(clist[j].equals("#")){
                    if(i < answer[0]){
                        answer[0] = i;
                    }
                    if(j < answer[1]){
                        answer[1] = j;
                    }
                    if(i+1 > answer[2]){
                        answer[2] = i+1;
                    }
                    if(j+1 > answer[3]){
                        answer[3] = j+1;
                    }
                }
            }
        }
        return answer;
    }
}
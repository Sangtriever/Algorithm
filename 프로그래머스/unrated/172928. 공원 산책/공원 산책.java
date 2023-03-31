import java.util.Arrays;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        char[][] location = new char[park.length][park[0].length()];
        int[] now = new int[]{0, 0};
        for(int i = 0; i < park.length; i++){
            location[i] = park[i].toCharArray();

            if(park[i].contains("S")){
                now[1] = i;
                now[0] = park[i].indexOf("S");
            }
        }

        loop1 : for (String route : routes) {
            System.out.println(Arrays.toString(now));
            int x = now[0];
            int y = now[1];

            for (int j = 0; j < Integer.parseInt(route.split(" ")[1]); j++) {
                if (route.charAt(0) == 'E') {
                    x++;
                }
                if (route.charAt(0) == 'W') {
                    x--;
                }
                if (route.charAt(0) == 'S') {
                    y++;
                }
                if (route.charAt(0) == 'N') {
                    y--;
                }
                if (x >= 0 && y >= 0 && y < location.length && x < location[0].length) {
                    if (location[y][x] == 'X') {
                        continue loop1;
                    }
                }else{
                    continue loop1;
                }
            }
            now[0] = x;
            now[1] = y;
        }
        int[] answer = {now[1],now[0]};
        return answer;
    }
}
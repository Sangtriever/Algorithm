class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] list = s.split("");
        int pcnt=0;
        int ycnt=0;
        for (int i = 0; i < list.length; i++) {
            if(list[i].equals("p") || list[i].equals("P")){
                pcnt++;
            } else if (list[i].equals("y") || list[i].equals("Y")) {
                ycnt++;
            }
        }
        if (pcnt==ycnt){
            return true;
        }else{
            return false;
        }
    }
}
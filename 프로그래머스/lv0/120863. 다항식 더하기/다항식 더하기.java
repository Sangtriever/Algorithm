
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] list = new String[100];
        list = polynomial.split(" ");
        int xCnt = 0;
        int num = 0;
        for (int i = 0; i < list.length; i = i+2) {
            if(list[i].contains("x")){
                if(list[i].equals("x")){
                    xCnt++;
                }else{
                    xCnt += Integer.parseInt(list[i].substring(0,list[i].length()-1));
                }
            }else{
                num += Integer.parseInt(list[i]);
            }
        }
        String xCntStr = xCnt > 0 ? xCnt == 1 ? "x" : xCnt + "x" : "";
        String numStr = num > 0 ? String.valueOf(num) : "";

        if(xCntStr.equals("")){
            if(numStr.equals("")){
                answer = "0";
            }else{
                answer = numStr;
            }
        }else{
            if(numStr.equals("")){
                answer = xCntStr;
            }else{
                answer = xCntStr +" + " + numStr;
            }
        }
        return answer;
    }
}
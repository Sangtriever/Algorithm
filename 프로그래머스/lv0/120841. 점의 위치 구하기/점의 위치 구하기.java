class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0){
            if(dot[1] > 0){
                return 1;
            }else{
                return 4;
            }
        }else{
            if(dot[1] > 0){
                return 2;
            }else{
                return 3;
            }
        }
    }
}
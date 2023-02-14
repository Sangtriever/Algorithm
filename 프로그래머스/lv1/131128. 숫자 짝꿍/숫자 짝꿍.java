class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] list1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] list2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 9; i >= 0; i--) {
            list1[i] = X.length() - X.replace(String.valueOf(i),"").length();
            list2[i] = Y.length() - Y.replace(String.valueOf(i),"").length();
            int num = Math.min(list1[i],list2[i]);
            if(num != 0){
                for (int j = 0; j < num; j++) {
                    answer.append(String.valueOf(i));
                }
            }
        }
        if (answer.toString().equals("")) {
            return "-1";
        } else if (answer.toString().replace("0","").equals("")) {
            return "0";
        } else {
            return answer.toString();
        }
    }
}
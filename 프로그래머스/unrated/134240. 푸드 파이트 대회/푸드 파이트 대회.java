class Solution {
    public String solution(int[] food) {
        String result = "";
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            answer.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
        }
        answer.append(0);
        for (int i = food.length-1; i >= 1 ; i--) {
            answer.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
        }
        result = String.valueOf(answer);
        return answer.toString();
    }
}
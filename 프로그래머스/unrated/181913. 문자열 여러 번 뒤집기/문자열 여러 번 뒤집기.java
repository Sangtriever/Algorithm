class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1] + 1;
            String s = new StringBuilder(my_string.substring(start, end)).reverse().toString();
            my_string = my_string.substring(0, start) + s + my_string.substring(end, my_string.length());
        }
        return my_string;
    }
}
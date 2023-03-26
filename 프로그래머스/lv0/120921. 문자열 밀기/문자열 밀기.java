class Solution {
    public int solution(String A, String B) {
        int answer = -1;

        for (int i = 0; i < A.length(); i++) {
            String s = A.substring(A.length()-i,A.length()) + A.substring(0,A.length()-i);
            if(s.equals(B)){
                return i;
            }
        }
        return answer;
    }
}
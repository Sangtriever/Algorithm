class Solution {
    public int solution(int n) {
        int answer = n+1;
        String nBinary = Integer.toBinaryString(n);
        String changeBinary = Integer.toBinaryString(answer);
        while (nBinary.replace("0","").length() != changeBinary.replace("0","").length()){
                answer++;
                changeBinary = Integer.toBinaryString(answer);
        }
        return answer;
    }
}
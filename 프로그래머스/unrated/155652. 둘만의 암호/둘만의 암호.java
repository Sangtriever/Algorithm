class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder(new String());
        char[] skips = skip.toCharArray();
        int[] lists = {0,0,0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (char c : skips) {
            lists[c - 97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char al = s.charAt(i);
            for (int j = 0; j < index; j++) {
                if(al + 1 == 123){
                    al = 'a';
                }else{
                    al += 1;
                }
                if(lists[al-97] == 1){
                    j--;
                }
            }
            answer.append(al);
        }
        return answer.toString();
    }
}
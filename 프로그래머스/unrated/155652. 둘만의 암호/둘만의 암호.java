class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder answer = new StringBuilder(new String());
        char[] skips = skip.toCharArray(); // 1. skips로 char배열로 만든다
        int[] lists = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; // 2. 알파벳 길이의 배열 lists를 만든다
        for (char c : skips) { // 3. 알파벳 리스트에 스킵 알파벳을 1로 바꾼다
            lists[c - 97]++;
        }
        for (int i = 0; i < s.length(); i++) { // 4. 바꿀 알파벳 만큼 for문을 돌린다
            char al = s.charAt(i); 
            for (int j = 0; j < index; j++) {
                if(al + 1 == 123){ // z를 넘어갈시 a로 변경
                    al = 'a';
                }else{
                    al += 1; // 아닐 경우는 +1
                }
                if(lists[al-97] == 1){ // 스킵 문자일경우 for문 횟수 +1
                    j--;
                }
            }
            answer.append(al);
        }
        return answer.toString();
    }
}
class Solution {
    public String solution(String s) {
        // 1단계 대문자소문자 치환
        s = s.toLowerCase();

        // 2단계 특수문자 -, _, . 제외 제거
        s = s.replaceAll("[^a-z0-9\\-_.]", "");

        // 3단계 .이 연속이면 한개로 바꾸기
        for (int i = 0; i < s.length()-1; i++) {
            char c = s.charAt(i);
            if(c == '.' && s.charAt(i+1) == '.'){
                s = s.substring(0,i) + s.substring(i+1,s.length());
                i--;
            }
        }
        // 4단계 .가 첫번째나 마지막이라면 제거
        if(s.charAt(0) == '.') s = s.substring(1);
        if(s.length() > 0 && s.charAt(s.length()-1) == '.') s = s.substring(0,s.length()-1);

        // 5단계 빈 문자열이라면 a를 대입
        if(s.equals("")) s = "a";

        // 6단계 길이가 16자 이상이라면 15까지만 출력
        if(s.length() > 15) s = s.substring(0,15);
        if(s.length() > 0 && s.charAt(s.length()-1) == '.') s = s.substring(0,s.length()-1);

        // 7단계 2 이하라면 s의 마지막 문자를 길이가 3이 될떄까지 끝에 붙이기
        if(s.length() < 3) {
            while (s.length() < 3){
                char c = s.charAt(s.length()-1);
                s += c;
            }
        }
        return s;
    }
}
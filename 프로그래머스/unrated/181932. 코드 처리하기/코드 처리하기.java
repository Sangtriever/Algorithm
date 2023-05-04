class Solution {
    public String solution(String code) {
    int n = code.length();
    int mode = 0;
    StringBuilder ret = new StringBuilder();
    
    for (int i = 0; i < n; i++) {
        if (code.charAt(i) == '1') {
            mode = 1 - mode;
        } else if (mode == 0 && i % 2 == 0) {
            ret.append(code.charAt(i));
        } else if (mode == 1 && i % 2 == 1) {
            ret.append(code.charAt(i));
        }
    }
    
    if (ret.length() == 0) {
        return "EMPTY";
    }
    
    return ret.toString();
}
}
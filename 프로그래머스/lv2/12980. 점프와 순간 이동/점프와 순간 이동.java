class Solution {
    public int solution(int n) {
        int ans = 1;
        if(n == 1){
            return ans;
        }
        while (true){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n--;
                ans++;
            }
            if(n == 1){
                return ans;
            }
        }
    }
}
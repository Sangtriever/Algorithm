class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[1]-common[0] == common[2]-common[1]){
            answer = arith(common);
        }else{
            answer = geo(common);
        }
        return answer;
    }
    public int arith (int[] nums){ // 등차
        return nums[nums.length-1]+(nums[nums.length-1]-nums[nums.length-2]);
    }
    public int geo (int[] nums){ // 등비
        return nums[nums.length-1]*(nums[nums.length-1]/nums[nums.length-2]);
    }
}
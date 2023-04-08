class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int maxNum = numbers[numbers.length-1];
        System.out.println(maxNum);
        int num = 1 + k*2;
        while(maxNum < num){
            num -= maxNum;
        }
        num -= 2;
        if(num <= 0){
            num = maxNum + num;
        }
        return num;
    }
}
import java.util.ArrayList;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        ArrayList<Integer> list = new ArrayList<>();
        int length = (int)(Math.log10(x)+1);
        System.out.println(length);
        int a = (int)Math.pow(10,length-1);
        System.out.println(a);
        int sum = 0;
        int num = x;
        for (int i = 0; i < length; i++) {
            sum += x / a;
            x = x % a;
            a /= 10;
        }

        double resultNum = (double)num / sum;
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
        if(num % sum == 0){
            System.out.println(resultNum);
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();
            if(num == 0){
                sum -= stack.pop();
            }else{
                sum += num;
                stack.add(num);
            }
        }
        System.out.println(sum);
    }
}
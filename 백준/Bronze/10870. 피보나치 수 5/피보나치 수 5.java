import java.util.*;

class Main {
    static ArrayList<Integer> list;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        list = new ArrayList<>();
        fibo(0, n);
        System.out.println(list.get(n));
    }
    public static void fibo(int num, int n){
        if(num == n + 1) return;
        else {
            if(num == 0){
                list.add(0);
            } else if(num == 1){
                list.add(1);
            } else {
                list.add(list.get(num-2) + list.get(num-1));
            }
            fibo(num+1, n);
        }
    }
}
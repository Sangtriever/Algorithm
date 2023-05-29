import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int result = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if(s.equals("ENTER")){
                result += set.size();
                set.clear();
            }else{
                set.add(s);
            }
        }
        result += set.size();
        System.out.println(result);
    }
}
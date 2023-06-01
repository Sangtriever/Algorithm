import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] list = new int[n];
        int min = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            if(list[i] > max) max = list[i];
        }
        while (min < max){
            int mid = (min+max)/2;
            long sum = 0;
            for (int j : list) {
                if (j - mid > 0) {
                    sum += j - mid;
                }
            }

            if(sum < m) max = mid;
            else min = mid + 1;
        }

        System.out.println(min - 1);
    }
}
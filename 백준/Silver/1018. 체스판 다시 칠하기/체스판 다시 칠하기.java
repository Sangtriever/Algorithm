import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        // 배열 입력
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                arr[i][j] = (str.charAt(j) == 'W');
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;

        // 모든 가능한 시작점에 대해 반복
        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }


    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y]; // 첫 번째 칸의 색상

        // 8x8 그리드의 각 칸 확인
        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {

                // 올바른 색상이 아닐 경우 count 1 증가
                if (arr[i][j] != TF) {
                    count++;
                }
                
                /* 
                 * 다음 칸은 색상이 바뀌므로
                 * true라면 false로, false라면 true로
                 * 값을 변경한다.
                 */
                TF = (!TF);
            }
            
            TF = !TF;
        }
        
        /*
         *  첫 번째 칸을 기준으로 할 때의 색칠할 개수(count)와
         *  첫 번째 칸의 색상과 반대되는 색상을 기준으로 할 때의
         *  색칠할 개수(64 - count) 중 최솟값을 count에 저장 
         */
        count = Math.min(count, 64 - count);
        
        /*
         * 이전까지의 경우 중 최솟값보다 현재 count 값이
         * 더 작을 경우 최솟값을 갱신 
         */
        min = Math.min(min, count);
    }
}
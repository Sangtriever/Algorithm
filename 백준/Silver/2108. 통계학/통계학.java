import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
            min = Math.min(min, list[i]);
            max = Math.max(max, list[i]);
        }
        Arrays.sort(list);

        int[] result = new int[4];
        result[0] = arithmeticMean(list);
        result[1] = list[list.length / 2];
        result[2] = manyNum(list);
        result[3] = max - min;

        for (int j : result) {
            System.out.println(j);
        }
    }

    public static int arithmeticMean(int[] list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return Math.round((float) sum / list.length);
    }

    public static int manyNum(int[] list) {
    int[] count = new int[8001];  // 수의 범위가 -4000부터 4000까지이므로 8001 크기의 배열을 사용
    int maxCount = 0;
    int manyNum = 0;
    boolean isSecond = false;

    for (int num : list) {
        count[num + 4000]++;  // 음수 값도 고려하여 인덱스 조정
    }

    for (int i = 0; i < count.length; i++) {
        if (count[i] > maxCount) {
            maxCount = count[i];
            manyNum = i - 4000;  // 인덱스 조정을 원래의 수로 복구
            isSecond = false;
        } else if (count[i] == maxCount && !isSecond) {
            manyNum = i - 4000;
            isSecond = true;
        }
    }

    return manyNum;
}
}
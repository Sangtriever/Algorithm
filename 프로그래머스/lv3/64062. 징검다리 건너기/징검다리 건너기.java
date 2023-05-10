class Solution {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int left = 0;
        int right = 0;
        for (int stone : stones) {
            right = Math.max(right, stone);
        }

        while (left <= right) { // 시작 범위와 끝 범위가 교차할 때까지 반복
            int mid = (left + right) / 2; // 중간 값을 구함

            if (isCrossAble(stones, k, mid)) { // 주어진 인원 수(mid)로 돌다리를 건널 수 있는지 확인
                answer = mid; // 현재 인원 수(mid)를 answer에 저장
                left = mid + 1; // 인원 수를 늘려서 범위를 오른쪽으로 좁힘 (더 큰 값을 확인하기 위해)
            } else {
                right = mid - 1; // 인원 수를 줄여서 범위를 왼쪽으로 좁힘 (더 작은 값을 확인하기 위해)
            }
        }

        return answer; // 최적의 인원 수 반환
    }
    private boolean isCrossAble(int[] stones, int k, int people) {
        int count = 0; // 연속으로 돌다리를 건널 수 없는 돌의 개수를 세는 변수
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] - people < 0) { // 주어진 인원 수로 돌다리를 건널 수 없는 경우
                count++; // 연속으로 건널 수 없는 돌의 개수 증가
                if (count >= k) { // 건널 수 없는 돌의 개수가 k보다 크거나 같으면 건널 수 없음
                    return false; // false 반환
                }
            } else {
                count = 0; // 건널 수 있는 돌이 나오면 연속으로 건널 수 없는 돌의 개수 초기화
            }
        }
        return true; // 모든 돌다리를 건널 수 있으면 true 반환
    }
}
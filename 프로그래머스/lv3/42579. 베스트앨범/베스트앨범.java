import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<String> rank = genrePlayRank(genres, plays);  // 장르별 총 재생 횟수를 기준으로 정렬된 순위 리스트
        boolean[] checked = new boolean[genres.length];  // 이미 처리한 노래인지 체크하는 배열

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            list.add(i);  // 고유 번호 리스트 생성
        }

        // 장르별로 고유 번호와 재생 횟수를 저장하는 PriorityQueue 생성
        Map<String, PriorityQueue<Song>> genresIdx = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (checked[i]) {
                continue;
            } else {
                checked[i] = true;
            }
            String genre = genres[i];
            // 재생 횟수가 높은 순으로 정렬되며, 재생 횟수가 같은 경우에는 고유 번호가 낮은 순으로 정렬됨
            PriorityQueue<Song> pq = new PriorityQueue<>((s1, s2) -> {
                if (s1.playCount == s2.playCount) {
                    return s1.index - s2.index;  // 고유 번호가 낮은 순으로 정렬
                }
                return s2.playCount - s1.playCount;  // 재생 횟수가 높은 순으로 정렬
            });
            pq.add(new Song(plays[i], i));  // 현재 고유 번호와 재생 횟수를 우선순위 큐에 추가
            for (int j = i + 1; j < genres.length; j++) {
                if (!checked[j] && genre.equals(genres[j])) {
                    checked[j] = true;
                    pq.add(new Song(plays[j], j));  // 같은 장르의 고유 번호와 재생 횟수를 우선순위 큐에 추가
                }
            }
            genresIdx.put(genre, pq);  // 장르를 키로하여 우선순위 큐를 맵에 저장
        }

        List<Integer> resultIdx = new ArrayList<>();
        // 정렬된 순위 리스트를 기반으로 고유 번호를 가져와 결과 리스트에 추가
        for (String s : rank) {
            PriorityQueue<Song> pq = genresIdx.get(s);
            int cnt = 2;  // 장르별로 최대 2개의 노래만 선택
            while (!pq.isEmpty() && cnt > 0) {
                resultIdx.add(list.get(pq.poll().index));  // 정렬된 순서대로 고유 번호를 결과 리스트에 추가
                cnt--;
            }
        }

        int[] answer = new int[resultIdx.size()];
        for (int i = 0; i < resultIdx.size(); i++) {
            answer[i] = resultIdx.get(i);  // 결과 리스트를 배열로 변환
        }
        return answer;
    }
    // 장르별 총 재생 횟수를 기준으로 정렬된 순위 리스트를 반환하는 메소드
    public List<String> genrePlayRank(String[] genres, int[] plays) {
        Map<String, Integer> genrePlayCounts = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genrePlayCounts.put(genres[i], genrePlayCounts.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<Map.Entry<String, Integer>> sortedGenres = new ArrayList<>(genrePlayCounts.entrySet());
        sortedGenres.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        List<String> rank = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sortedGenres) {
            rank.add(entry.getKey());
        }
        return rank;
    }

    // 곡의 재생 횟수와 고유 번호를 저장하는 Song 클래스
    class Song {
        int playCount;
        int index;

        public Song(int playCount, int index) {
            this.playCount = playCount;
            this.index = index;
        }
    }
}


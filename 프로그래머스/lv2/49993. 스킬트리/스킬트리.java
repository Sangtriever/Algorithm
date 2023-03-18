class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        // 각 알파벳의 순서를 저장하기 위해 알파벳 갯수만큼 배열 선언
        int[] skillCheck = new int[26];

        // 1~26까지 각 알파벳 순서 등록
        for (int i = 0; i < skill.length(); i++) {
            char c = skill.charAt(i);
            skillCheck[c - 65] = i + 1;
        }

        for (int i = 0; i < skill_trees.length; i++) {
            // 지금까지 배운 현재 스킬 상황
            int cnt = 1;
            boolean isAble = true;
            for (int j = 0; j < skill_trees[i].length(); j++) {
                char c = skill_trees[i].charAt(j);

                // 만약 지금 배울 스킬이 순서에 맞다면 cnt++
                if (skillCheck[c - 65] == cnt) {
                    cnt++;
                }else if(skillCheck[c - 65] ==0){ // 순서 상관 없는 알파벳이면 넘기기
                    continue;
                }else{  // 순서 상관 있는 알파벳이지만, 현재 단계와 맞지 않으면 break
                    isAble = false;
                    break;
                }
            }
            if(isAble){
                answer++;
            }
        }
        return answer;
    }
}
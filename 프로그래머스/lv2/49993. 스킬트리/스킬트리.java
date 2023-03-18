import java.util.Arrays;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int[] skillCheck = new int[26];
        for (int i = 0; i < skill.length(); i++) {
            char c = skill.charAt(i);
            skillCheck[c - 65] = i + 1;
        }
        for (int i = 0; i < skill_trees.length; i++) {
            int cnt = 1;

            for (int j = 0; j < skill_trees[i].length(); j++) {
                char c = skill_trees[i].charAt(j);
                if (skillCheck[c - 65] == cnt) {
                    cnt++;
                }else if(skillCheck[c - 65] ==0){

                }else{
                    break;
                }
                if(j == skill_trees[i].length()-1){
                    answer++;
                }
            }
        }
        return answer;
    }
}

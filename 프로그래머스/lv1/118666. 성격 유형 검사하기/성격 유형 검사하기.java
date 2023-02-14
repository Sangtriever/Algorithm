class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int RT = 0, CF = 0, JM = 0, AN = 0;
        for (int i = 0; i < survey.length; i++) {
            int score = 0;
            switch (choices[i]) {
                case 1 -> score = -3;
                case 2 -> score = -2;
                case 3 -> score = -1;
                case 4 -> score = 0;
                case 5 -> score = 1;
                case 6 -> score = 2;
                case 7 -> score = 3;
            }
            switch (survey[i]) {
                case "RT" -> RT += score;
                case "TR" -> RT -= score;
                case "CF" -> CF += score;
                case "FC" -> CF -= score;
                case "JM" -> JM += score;
                case "MJ" -> JM -= score;
                case "AN" -> AN += score;
                case "NA" -> AN -= score;
            }
        }
        if (RT <= 0) answer += "R";
        else answer += "T";
        if (CF <= 0) answer += "C";
        else answer += "F";
        if (JM <= 0) answer += "J";
        else answer += "M";
        if (AN <= 0) answer += "A";
        else answer += "N";
        return answer;
    }
}
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] b = new int[board.length + 2][board.length + 2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                        for (int k = i; k <i+3; k++) {
                            for (int l = j; l < j+3; l++) {
                                b[k][l] = 1;
                        }
                    }
                }
            }
        }

        for (int i = 1; i < b.length-1; i++) {
            for (int j = 1; j < b[i].length-1; j++) {
                if(b[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}
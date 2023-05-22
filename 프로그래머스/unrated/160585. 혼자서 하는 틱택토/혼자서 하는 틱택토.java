class Solution {
    public int solution(String[] board) {
        int[] OXCnt = countCheck(board);
        int o = OXCnt[0];
        int x = OXCnt[1];
        int[] tictactoeOXCnt = tictactoeCountCheck(board);
        int tictactoeO = tictactoeOXCnt[0];
        int tictactoeX = tictactoeOXCnt[1];

        // 조건에 따라 게임의 유효성을 판단하여 결과 반환
        if (o - x > 1 || x > o || (tictactoeO > 0 && tictactoeX > 0))
            return 0;

        if (tictactoeO > tictactoeX && o - x == 1)
            return 1;

        if (tictactoeX > tictactoeO && o == x)
            return 1;

        if (tictactoeO == 0 && tictactoeX == 0)
            return 1;

        return 0;
    }

    // O와 X의 개수를 카운트하여 배열로 반환하는 메소드
    public int[] countCheck(String[] board) {
        int o = 0, x = 0;
        for (String row : board) {
            for (char c : row.toCharArray()) {
                if (c == 'O')
                    o++;
                else if (c == 'X')
                    x++;
            }
        }
        return new int[]{o, x};
    }

    // 틱택토 게임에서 가로, 세로, 대각선을 체크하여 O와 X의 개수를 카운트하는 메소드
    public int[] tictactoeCountCheck(String[] board) {
        int tictactoeO = 0;
        int tictactoeX = 0;

        // 가로, 세로, 대각선 체크
        for (int i = 0; i < board.length; i++) {
            int countOHorizontal = 0, countXHorizontal = 0;
            int countOVertical = 0, countXVertical = 0;
            int countODiagonal1 = 0, countXDiagonal1 = 0;
            int countODiagonal2 = 0, countXDiagonal2 = 0;

            for (int j = 0; j < board[i].length(); j++) {
                char cHorizontal = board[i].charAt(j);
                char cVertical = board[j].charAt(i);
                char cDiagonal1 = board[j].charAt(j);
                char cDiagonal2 = board[j].charAt(board.length - 1 - j);

                if (cHorizontal == 'O')
                    countOHorizontal++;
                else if (cHorizontal == 'X')
                    countXHorizontal++;

                if (cVertical == 'O')
                    countOVertical++;
                else if (cVertical == 'X')
                    countXVertical++;

                if (cDiagonal1 == 'O')
                    countODiagonal1++;
                else if (cDiagonal1 == 'X')
                    countXDiagonal1++;

                if (cDiagonal2 == 'O')
                    countODiagonal2++;
                else if (cDiagonal2 == 'X')
                    countXDiagonal2++;
            }

            if (countOHorizontal == 3 || countOVertical == 3 || countODiagonal1 == 3 || countODiagonal2 == 3)
                tictactoeO++;
            else if (countXHorizontal == 3 || countXVertical == 3 || countXDiagonal1 == 3 || countXDiagonal2 == 3)
                tictactoeX++;
        }

        return new int[]{tictactoeO, tictactoeX};
    }
}
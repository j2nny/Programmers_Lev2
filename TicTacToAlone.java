//문제: https://school.programmers.co.kr/learn/courses/30/lessons/160585

public class TicTacToAlone {
    public TicTacToAlone() {
        System.out.println(solution(new String[] { "O.X", ".O.", "..X" }));
        System.out.println(solution(new String[] { "OOO", "...", "XXX" }));
        System.out.println(solution(new String[] { "...", ".X.", "..." }));
        System.out.println(solution(new String[] { "...", "...", "..." }));
    }

    public int solution(String[] board) {

        String[][] grid = new String[][] {
                board[0].split(""), board[1].split(""), board[2].split("")
        };

        int cntO = count("O", grid);
        int cntX = count("X", grid);

        if (cntO < cntX || cntO - cntX > 1) {
            return 0;
        }

        int[] winO = win("O", grid);
        int[] winX = win("X", grid);

        if (winO[0] > 1 || winO[1] > 1 || winX[0] > 1 || winX[1] > 1) {
            return 0;
        }

        if (winO[0] + winO[1] + winO[2] != 0) {
            if (winX[0] + winX[1] + winX[2] != 0 || cntO - cntX != 1) {
                return 0;
            }
        }

        if (winX[0] + winX[1] + winX[2] != 0) {
            if (winO[0] + winO[1] + winO[2] != 0 || cntO - cntX != 0) {
                return 0;
            }
        }

        return 1;
    }

    public int count(String turn, String[][] board) {

        int result = 0;

        for (String[] strings : board) {
            for (String str : strings) {
                if (turn.equals(str)) {
                    result++;
                }
            }
        }

        return result;
    }

    public int[] win(String turn, String[][] board) {

        int[] result = new int[] { 0, 0, 0 };

        for (int i = 0; i < board.length; i++) {
            if (turn.equals(board[i][0]) && turn.equals(board[i][1]) && turn.equals(board[i][2])) {
                result[0]++;
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            if (turn.equals(board[0][i]) && turn.equals(board[1][i]) && turn.equals(board[2][i])) {
                result[1]++;
            }
        }

        if (turn.equals(board[0][0]) && turn.equals(board[1][1]) && turn.equals(board[2][2])) {
            result[2]++;
        }

        if (turn.equals(board[0][2]) && turn.equals(board[1][1]) && turn.equals(board[2][0])) {
            result[2]++;
        }

        return result;
    }

    public static void main(String[] args) {
        new TicTacToAlone();
    }
}

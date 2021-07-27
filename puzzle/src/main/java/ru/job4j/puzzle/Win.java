package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 1) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 0) {
                        rsl = false;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == 1) {
                for (int j = 0; j < board.length; j++) {
                    if (board[j][i] == 0) {
                        rsl = false;
                        break;
                    }
                }
            }
        }
        return rsl;
    }
}

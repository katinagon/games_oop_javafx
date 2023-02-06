package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return checkHorizontal(board) || checkVertical(board);
    }

    public static boolean checkHorizontal(int[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 1) {
                for (int j = 1; j < board[i].length; j++) {
                    if (board[i][j] == board[i][j - 1]) {
                        count++;
                    }
                }
            }
        }
        return count == 4;
    }

    public static boolean checkVertical(int[][] board) {
        int count = 0;
        int j = 0;
        while (j < 5) {
            if (board[0][j] == 1) {
                for (int i = 1; i < board.length; i++) {
                    if (board[i][j] == board[i - 1][j]) {
                        count++;
                    }
                }
            }
            j++;
        }
        return count == 4;
    }
}

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        System.out.println("Valid? " + isValidSudoku(board));
    }

    static boolean isValidSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[10];
            boolean[] col = new boolean[10];
            boolean[] box = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != 0) {
                    if (row[board[i][j]]) return false;
                    row[board[i][j]] = true;
                }
                if (board[j][i] != 0) {
                    if (col[board[j][i]]) return false;
                    col[board[j][i]] = true;
                }
                int r = 3 * (i / 3) + j / 3;
                int c = 3 * (i % 3) + j % 3;
                if (board[r][c] != 0) {
                    if (box[board[r][c]]) return false;
                    box[board[r][c]] = true;
                }
            }
        }
        return true;
    }
}

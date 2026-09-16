import java.util.*;

public class Valid_Sudoku {

    public static void main(String[] args) {

        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        // Check whether the given Sudoku board is valid.
        boolean ans = sudoku(board);

        System.out.println(ans);
    }

    static boolean sudoku(char[][] board) {

        // Store every number's occurrence in its row, column, and 3x3 box.
        Map<String, Integer> map = new HashMap<>();

        // Traverse every cell of the 9x9 Sudoku board.
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                // Ignore empty cells represented by '.'.
                if (board[i][j] != '.') {

                    // Create a unique key for the number and its row.
                    // Example: "5 row 0"
                    String row = board[i][j] + " row " + i;

                    // Create a unique key for the number and its column.
                    // Example: "5 col 0"
                    String col = board[i][j] + " col " + j;

                    // Create a unique key for the number and its 3x3 box.
                    // i / 3 gives the box row and j / 3 gives the box column.
                    // Example: "5 box 0and0"
                    String box = board[i][j] + " box " + i / 3 + "and" + j / 3;

                    // Increase the frequency of this number in its row.
                    map.put(row, map.getOrDefault(row, 0) + 1);

                    // Increase the frequency of this number in its column.
                    map.put(col, map.getOrDefault(col, 0) + 1);

                    // Increase the frequency of this number in its 3x3 box.
                    map.put(box, map.getOrDefault(box, 0) + 1);

                    // If the same number appears more than once
                    // in the same row, column, or box, the board is invalid.
                    if (map.get(row) > 1 ||
                        map.get(col) > 1 ||
                        map.get(box) > 1) {

                        return false;
                    }
                }
            }
        }

        // No duplicate was found, so the Sudoku board is valid.
        return true;
    }
}
import java.util.*;

public class matrix_zero {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        // n = number of rows
        // m = number of columns
        int n = matrix.length;
        int m = matrix[0].length;

        // Store all matrix elements
        List<Integer> res = new ArrayList<>();

        // Traverse the entire matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res.add(matrix[i][j]);
            }
        }

        // Print original matrix
        System.out.println("Original matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // =========================================
        // STEP 1: Find the rows and columns having 0
        // =========================================

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        // Check every element in the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // If we find 0
                if (matrix[i][j] == 0) {

                    // Store its row number
                    rows.add(i);

                    // Store its column number
                    cols.add(j);
                }
            }
        }

        System.out.println("Rows containing 0: " + rows);
        System.out.println("Columns containing 0: " + cols);


        // =========================================
        // STEP 2: Make those rows completely 0
        // =========================================

        for (int row : rows) {  

            // Visit every column in that row
            for (int j = 0; j < m; j++) {

                // Make the element 0
                matrix[row][j] = 0;
            }
        }


        // =========================================
        // STEP 3: Make those columns completely 0
        // =========================================

        for (int col : cols) {

            // Visit every row in that column
            for (int i = 0; i < n; i++) {

                // Make the element 0
                matrix[i][col] = 0;
            }
        }


        // =========================================
        // STEP 4: Print final matrix
        // =========================================

        System.out.println("Final matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
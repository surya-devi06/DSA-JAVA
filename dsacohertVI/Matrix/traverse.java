public class traverse {
    public static void main(String[] args) {
        int[][] m = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        row_traversal(m);
        col_traversal(m);
        primary_traversal(m);
        secondary_traversal(m);
    }

    static void row_traversal(int[][] m) {
        System.out.println("row wise traversal: ");
        for (int[] i : m) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    static void col_traversal(int[][] m) {
        System.out.println("column wise traversal: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
    
    static void primary_traversal(int[][] m) {
        System.out.println("Primary diogonal printing: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    System.out.println(m[i][j]);
                }
            }
        }
        System.out.println("using single for loop {for primary}: ");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i][i]);
        }
    }
    
    static void secondary_traversal(int[][] m) {
        System.out.println("secondary dioganal printing: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j == m.length - 1) {
                    System.out.println(m[i][j]);
                }
            }

        }
        
        System.out.println("using single for loop {for secondary}: ");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i][m.length-1-i]);
        }
    }
    
}

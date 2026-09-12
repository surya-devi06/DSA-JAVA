import java.util.*;
public class spiral_matrix {
    public static void main(String[] args) {
        int[][] mat = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
        int n = mat[0].length;
        int m = mat.length;
        List<Integer> res = new ArrayList<>();
        int left = 0, right = n - 1, top = 0, bottom = m - 1,dir=0;

        while (left <= right && top <= bottom) {
            switch (dir) {
                case 0 -> {
                    //left to right
                    for (int i = left; i <= right; i++) {
                        res.add(mat[top][i]);
                    }
                    top++;
                }
                case 1 -> {
                    //top to bottom
                    for (int i = top; i <= bottom; i++) {
                        res.add(mat[i][right]);
                    }
                right--;
                }
                case 2 -> {
                    //right to left
                    for (int i = right; i >= left; i--) {
                        res.add(mat[bottom][i]);
                    }
                    bottom--;
                }
                case 3 -> {
                    //bottom to top
                    for (int i = bottom; i >= top; i--) {
                        res.add(mat[i][left]);
                    }
                    left++;
                }
            }
            dir += 1;
        }
        System.out.println(res);
    }
}

public class rotate_image {
    public static void main(String[] args) {
        int[][] m = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(m, i, j);
            }
        }
        System.out.println("swap the array(Rotate): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            rev(m[i], 0, n-1);
        }
        System.out.println("after reversing: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void swap(int [][] m,int left ,int right ) {
            int temp = m[left][right];
            m[left][right] = m[right][left];
            m[right][left] = temp;
    }

    static void rev(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
}

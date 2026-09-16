import java.util.*;
public class Merge2 {
    public static void main(String[] args) {
        int[] num1 = { 4, 3, 2, 5, 9, 7 };
        int[] num2 = { 0, 3, 7, 6, 5, 8 };

        int n = num1.length;
        int m = num2.length;
        int i = 0, j = 0, k = 0;
        int[] res = new int[n + m];
        while (i < n && j < m) {
            if (num1[i] < num2[j]) {
                res[k] = num1[i];
                i++;
            } else {
                res[k] = num2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            res[k] = num1[i];
            i++;
            k++;
        }
        while (j < m) {
            res[k] = num2[j];
            j++;
            k++;
        }

        // for (int x = 0; x < m+n; x++) {
        //     num1[x] = res[x];
        // }
        System.out.println(Arrays.toString(res));
    }
    
}

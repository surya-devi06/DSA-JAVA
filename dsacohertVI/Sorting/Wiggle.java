import java.util.*;
public class Wiggle {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 1, 1, 6, 4 };
        Arrays.sort(arr);
        int n = arr.length;
        int counter = 0;
        int mid = (n - 1) / 2;
        int right = n - 1;
        int[] res = new int[right+1];
        while (mid >= 0 || right > (arr.length - 1) / 2) {
            if (counter % 2 == 0) {
                res[counter++] = arr[mid--];
            } else {
                res[counter++] = arr[right--];
            }
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
        System.out.println(Arrays.toString(res));
    }
}

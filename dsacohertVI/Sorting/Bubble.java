import java.util.*;
class Bubble {
    public static void main(String[] args) {
        int[] arr = { 4, 56, 2, 10, 0, 3 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            
            if (!isSwapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
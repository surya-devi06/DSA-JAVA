import java.util.*;
public class minimum_absolute_diff {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 3 };
        int n = arr.length;
        sort(arr, 0, n-1);
        int mindiff = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            int current = arr[i] - arr[i - 1];
            if (current < mindiff) {
                res = new ArrayList<>();
                mindiff = current;
            }
            if (mindiff == current) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        System.out.println(res);

    }
    
    private static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }
    
    private static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        
        int[] temp = new int[right - left + 1];

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }


    }
}

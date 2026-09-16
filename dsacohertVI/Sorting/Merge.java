import java.util.*;

public class Merge {

    public static void main(String[] args) {

        // Original unsorted array
        int[] arr = {5, 1, 1, 2, 0, 0};

        // 'right' represents the last valid index of the array
        int n = arr.length - 1;

        // Start Merge Sort on the complete array
        // left = 0  -> first index
        // right = 5 -> last index
        split(arr, 0, n);

        // Print the final sorted array
        System.out.println(Arrays.toString(arr));
    }


    // =====================================================
    // SPLIT = Divide the array into smaller parts
    // =====================================================
    private static void split(int[] arr, int left, int right) {

        // If left == right, only ONE element is present.
        // One element is already sorted.
        // So stop dividing.
        if (left >= right) {
            return;
        }

        // Find the middle index.
        // This safely calculates the middle without overflow.
        int mid = left + (right - left) / 2;

        // Recursively divide the LEFT half
        // left ........ mid
        split(arr, left, mid);

        // Recursively divide the RIGHT half
        // mid + 1 ........ right
        split(arr, mid + 1, right);

        // Both halves are now sorted.
        // Merge them together.
        merge(arr, left, mid, right);
    }


    // =====================================================
    // MERGE = Compare two sorted halves and combine them
    // =====================================================
    private static void merge(int[] arr, int left, int mid, int right) {

        // i points to the beginning of the LEFT half
        int i = left;

        // j points to the beginning of the RIGHT half
        int j = mid + 1;

        // k points to the next empty position in temp
        int k = 0;

        // Temporary array stores the sorted result
        // of the current left-to-right range.
        int[] temp = new int[right - left + 1];


        // Compare elements from LEFT and RIGHT halves
        // until one of the halves becomes empty.
        while (i <= mid && j <= right) {

            // If LEFT element is smaller or equal,
            // put it into temp.
            if (arr[i] <= arr[j]) {

                temp[k] = arr[i];

                // Move to the next LEFT element
                i++;

            } else {

                // RIGHT element is smaller,
                // so put it into temp.
                temp[k] = arr[j];

                // Move to the next RIGHT element
                j++;
            }

            // Move to the next empty position in temp
            k++;
        }


        // If LEFT half still has elements,
        // copy all remaining LEFT elements.
        while (i <= mid) {

            temp[k] = arr[i];

            i++;
            k++;
        }


        // If RIGHT half still has elements,
        // copy all remaining RIGHT elements.
        while (j <= right) {

            temp[k] = arr[j];

            j++;
            k++;
        }


        // Copy the sorted temp array
        // back into the correct portion of arr.
        //
        // 'left + x' tells us where the current
        // Merge Sort section starts in the original array.
        for (int x = 0; x < temp.length; x++) {

            arr[left + x] = temp[x];
        }
    }
}
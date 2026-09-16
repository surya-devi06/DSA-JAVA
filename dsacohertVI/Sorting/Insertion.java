import java.util.*; // Import Arrays so we can print the array easily

public class insertion {

    public static void main(String[] args) {

        // Our input array
        int[] nums = {2, 4, 2, 0, 45, 32, 76, 900, 100, 400, 8};

        // Store the length of the array
        int n = nums.length;

        // Start from the first element and go until the last element
        for (int i = 0; i < n; i++) {

            // Take the current element.
            // Think: "I am holding this element in my hand."
            int key = nums[i];

            // Start checking from the element immediately before the key
            int j = i - 1;

            // Check two conditions:
            // 1. j >= 0 → make sure we don't go outside the array
            // 2. nums[j] > key → check whether the previous element is bigger
            while (j >= 0 && nums[j] > key) {

                // Move the bigger element one position to the right
                // This creates an empty position for the key
                nums[j + 1] = nums[j];

                // Move one position backwards
                // We continue searching for the correct position of key
                j--;
            }

            // Put the key into its correct position
            // j + 1 is the empty position created after shifting
            nums[j + 1] = key;
        }

        // Print the final sorted array
        System.out.println(Arrays.toString(nums));
    }
}

import java.util.*;
public class Selction {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 6, 0, 10, 9, 1000 };
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}

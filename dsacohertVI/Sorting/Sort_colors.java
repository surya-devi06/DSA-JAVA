//https://leetcode.com/problems/sort-colors/description/
import java.util.*;

public class Sort_colors {
    public static void main(String[] args) {
        ;

        int[] nums = { 2, 0, 2, 1, 1, 0 };
        int n = nums.length - 1;

        int low = 0, high = n, mid = 0;
        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
        Swit obj = new Swit();
        obj.Switch();
    }

    private static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}


class Swit {
    void Switch(){
        int [] nums = {2,0,1};
        int n = nums.length - 1;
        int low = 0, high = n, mid = 0; 
        while (mid <= high) {
            int k = 0;
            switch (nums[k++]) {
                case 2 -> {
                    swap(nums, mid, high--);
                }
                case 0 -> {
                    swap(nums, low++, mid++);
                }

                default -> {
                    mid++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}

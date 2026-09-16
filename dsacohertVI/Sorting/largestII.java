import java.util.Arrays;

public class largestII {
    public static void main(String [] args){
        int [] nums = {1,2,1,3};
        int n = nums.length;
        int[] temp = new int[n];
        int k = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                temp[k++] = nums[i + 1]; // Store the greater element
            }
        }

        // Trim array to match exact count of found elements
        int[] res = Arrays.copyOf(temp, k);
        System.out.println(Arrays.toString(res)); 
    }
}


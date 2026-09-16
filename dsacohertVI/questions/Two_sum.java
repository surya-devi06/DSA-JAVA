import java.util.*;
public class Two_sum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 3, 6 };
        int target = 9;
        int[] ans = brute_force(nums, target);
        System.out.println("Brute force: "+Arrays.toString(ans));

        int[] ans1 = optimal_sol(nums, target);
        System.out.println("optimal solution: "+Arrays.toString(ans1));
    }

    static int[] brute_force(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    
    static int[] optimal_sol(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    
}

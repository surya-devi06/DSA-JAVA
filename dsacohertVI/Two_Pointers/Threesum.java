
import java.util.*;
public class Threesum {
    public static void main(String [] args){
        int [] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        int n = nums.length-1;
        List<List<Integer>> res = new ArrayList<>();
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < n; i++) {
            if (i == 0 || i > 0 && nums[i] != nums[i- 1] ) {
                int low = i + 1, high = n, target = -nums[i];
                while (low < high) {
                int current = nums[low] + nums[high];
                    if (current == target) {
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[i] == nums[low+1])
                            low++;
                        while (low < high && nums[i] == nums[high-1])
                            high--;

                        low++;
                        high--;
                    } else if (current > target) {
                        high--;
                    } else {
                        low++;
                    }
                }
                
            }
        }
        System.out.println(res);
    }
}

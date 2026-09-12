import java.util.*;
//https://leetcode.com/problems/contiguous-array/description/

public class contigeous {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 1, 1, 0, 0, 0 };
        int n = nums.length;
        if (n == 0) {
            System.out.println("-1");
        }
        Map<Integer, Integer> freq = new HashMap<>();
        int presum = 0;
        int longest = 0;

        for (int i = 0; i < n; i++){
            // presum += (nums[i]==0 ? -1 : 1);
            if(nums[i] == 0) {
                presum += -1;
            }
            else {
                presum +=1;
            }
            if (presum == 0) {
                longest = i+1;
            }
            else if(freq.containsKey(presum)){
                longest = Math.max(longest, i - freq.get(presum));
            }
            else{
                freq.put(presum,i);
            }
        }
        System.out.println(longest);
    }

}
    


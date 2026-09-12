import java.util.*;
public class union {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 2, 1};
        int[] b = { 3, 2, 2, 3, 3, 2 };
        
        Set<Integer> set = new HashSet<>();

        for (int i : a) {
            set.add(i);
        }
        for (int i : b) {
            set.add(i);
        }
        ArrayList<Integer> arr = new ArrayList<>(set.size());
        for (int setarr : set) {
            arr.add(setarr);
        }
        System.out.println(arr);

        
    }
    
}

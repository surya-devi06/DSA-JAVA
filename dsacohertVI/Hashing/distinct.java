import java.util.*;
class distinct{
    public static void main(String [] args){
        int[] arr = { 12, 1, 14, 3, 16 };
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
import java.util.*;
class single_num {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        Map<Integer, Integer> map = new HashMap<>();

        //using XOR(any number xor the same num cancel each other
        int ans = xor(arr);
        System.out.println("using XOR operation: "+ans);

        for (int num : arr) {
            //without using inbuild method
            if (map.containsKey(num)) {
                int freq = map.get(num);
                map.put(num, freq + 1);
            } else {
                map.put(num, 1);
            }
            // map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == 1) {
                System.out.println("single number = " + pair.getKey() + ": " + pair.getValue());
            }
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }

    }
    static int xor(int [] arr){
        int res = 0;
        for(int num : arr){
            res ^= num;
        }
        return res;
    }
}

    


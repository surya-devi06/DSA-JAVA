//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=binary-search

public class Smallest_letter_ceil {
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };
        char target = 'a';
        char ans = ceil_letter(arr, target);
        System.out.println(ans);

    }

    static char ceil_letter(char[] str, char target) {
        // if(str[str.lenght-1] < target){
        //     return -1;
        // }
        int start = 0;
        int end = str.length - 1;
        int count = 0;
        while (start < end) {
            count++;
            int mid = start + (end - start) / 2;
            if (str[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return str[start % str.length];//0,1,2 pattern(ex: 0 % 1 = 0, 1 % 2 = 1, 2 % 3 = 2, 3 % 3 = 0.....etc)
    }

}




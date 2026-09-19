//https://leetcode.com/problems/valid-anagram/
public class Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(check(s, t));
    }

        private static boolean check(String s, String t) {
        int[] freq = new int[128];

        int n = s.length(), m = t.length();
        if (n != m)
            return false;
        for (int i : s.toCharArray()) {
            freq[i]++;
        }

        for (int i : t.toCharArray()) {
            freq[i]--;
        }

        for (int count : freq) {
            if (count > 0)
                return false;
        }
    return true;
    }
    
}

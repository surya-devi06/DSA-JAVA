public class ransom_note {
    public static void main(String ars[]) {
        String ransomNote = "surya";
        String magazine = "riasurya";

        int[] hash = new int[128];

        for (int i : magazine.toCharArray()) {
            hash[i]++;
        }
        for (int i : ransomNote.toCharArray()) {
            hash[i]--;
        }

        for (int i : hash) {
            if (i < 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        return;
    }
    
}

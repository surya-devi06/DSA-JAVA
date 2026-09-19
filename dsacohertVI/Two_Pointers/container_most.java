//https://leetcode.com/problems/container-with-most-water/description/

public class container_most {
    public static void main(String[] args) {
        int[] con = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int n = con.length;
        int left = 0;
        int right = con.length - 1;
        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(con[left], con[right]);
            int area = width * currentHeight;

            maxArea = Math.max(area, maxArea);

            if (con[left] < con[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
    }
}

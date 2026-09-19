public class Trapping_Water {

    public static void main(String[] args) {

        // Each number represents the height of a vertical bar.
        // We need to calculate how much rainwater can be trapped between the bars.
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        // Number of bars in the array
        int n = height.length;

        // Highest bar found so far from the LEFT side
        int left_max = 0;

        // Highest bar found so far from the RIGHT side
        int right_max = 0;

        // Two pointers:
        // left  -> starts from the beginning
        // right -> starts from the end
        int left = 0;
        int right = n - 1;

        // Stores the total amount of trapped water
        int res = 0;


        // Continue until the two pointers meet
        while (left <= right) {

            /*
             * We compare the heights at both ends.
             *
             * If the LEFT bar is shorter or equal to the RIGHT bar,
             * we can safely calculate water for the LEFT position.
             */
            if (height[left] <= height[right]) {

                /*
                 * If the current LEFT bar is higher than the
                 * previous maximum LEFT bar, update left_max.
                 *
                 * Example:
                 * left_max = 2
                 * height[left] = 3
                 *
                 * New left_max = 3
                 */
                if (height[left] >= left_max) {
                    left_max = height[left];

                } else {

                    /*
                     * Current bar is shorter than left_max.
                     *
                     * Water trapped here =
                     * left_max - current bar height
                     *
                     * Example:
                     * left_max = 3
                     * current height = 1
                     *
                     * Water = 3 - 1 = 2
                     */
                    res += left_max - height[left];
                }

                // Move LEFT pointer to the next bar
                left++;

            } else {

                /*
                 * RIGHT bar is shorter.
                 *
                 * Therefore, calculate trapped water
                 * from the RIGHT side.
                 */
                if (height[right] >= right_max) {

                    // Update the highest bar seen from the right
                    right_max = height[right];

                } else {

                    /*
                     * Current RIGHT bar is lower than right_max.
                     *
                     * Water trapped here =
                     * right_max - current bar height
                     */
                    res += right_max - height[right];
                }

                // Move RIGHT pointer to the previous bar
                right--;
            }
        }

        // Print total amount of trapped water
        System.out.println(res);
    }
}
public class Solution {
    /*
     * Problem: Move all zeros to the end while maintaining order of other elements.
     * Approach: Two-pointer method, swap non-zero elements forward.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public void moveZeros(int[] nums) {
        int index = 0; // Position to place the next non-zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        // Fill remaining elements with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}

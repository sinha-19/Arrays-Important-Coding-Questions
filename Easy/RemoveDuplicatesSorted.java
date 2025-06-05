public class Solution {
    /*
     * Problem: Remove duplicates from sorted array in-place.
     * Approach: Two-pointer technique.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Returns: New length after duplicates removed.
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

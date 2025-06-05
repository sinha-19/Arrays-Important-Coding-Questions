public class Solution {
    /*
     * Problem: Rearrange numbers into the next lexicographically greater permutation.
     * Approach: Find break point, swap with next greater, then reverse suffix.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        // Find the first decreasing element from right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // Swap with next greater element
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        // Reverse the suffix
        reverse(nums, i + 1, nums.length - 1);
    }
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

public class Solution {
    /*
     * Problem: Sort array of 0s, 1s, and 2s (Dutch National Flag).
     * Approach: 3-pointer technique (low, mid, high).
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

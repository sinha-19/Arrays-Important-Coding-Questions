public class Solution {
    /*
     * Problem: Find longest subarray with given sum K (only positives).
     * Approach: Use sliding window since all positives.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int longestSubarrayWithSumK(int[] nums, int k) {
        int start = 0, sum = 0, maxLength = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum > k) {
                sum -= nums[start++];
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }
        return maxLength;
    }
}

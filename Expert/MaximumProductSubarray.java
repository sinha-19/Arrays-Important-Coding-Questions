public class Solution {
    /*
     * Problem: Find the contiguous subarray with the maximum product.
     * Approach: Track max and min ending at current index.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int maxProduct(int[] nums) {
        int maxProd = nums[0], minProd = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = maxProd;
            maxProd = Math.max(nums[i], Math.max(maxProd * nums[i], minProd * nums[i]));
            minProd = Math.min(nums[i], Math.min(temp * nums[i], minProd * nums[i]));
            result = Math.max(result, maxProd);
        }
        return result;
    }
}

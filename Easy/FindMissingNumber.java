public class Solution {
    /*
     * Problem: Find the missing number from 0 to n (length n, one missing).
     * Approach: Use sum formula or XOR method.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int findMissing(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return expected - actual;
    }
}

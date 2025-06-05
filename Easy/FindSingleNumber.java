public class Solution {
    /*
     * Problem: Every number appears twice except one. Find that one.
     * Approach: XOR all elements (a ^ a = 0, 0 ^ b = b).
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int findSingle(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

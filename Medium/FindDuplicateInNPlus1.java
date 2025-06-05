public class Solution {
    /*
     * Problem: One duplicate in array of size n+1 with numbers from 1 to n.
     * Approach: Floyd's Tortoise & Hare (Cycle detection).
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        // First intersection point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        // Find entry point
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

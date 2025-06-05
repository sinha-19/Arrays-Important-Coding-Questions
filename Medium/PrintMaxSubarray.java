public class Solution {
    /*
     * Problem: Print subarray with max sum (Extended Kadane).
     * Approach: Track start & end indices.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public void printMaxSubarray(int[] nums) {
        int maxSum = nums[0], currSum = nums[0];
        int start = 0, end = 0, tempStart = 0;
        for (int i = 1; i < nums.length; i++) {
            if (currSum + nums[i] < nums[i]) {
                currSum = nums[i];
                tempStart = i;
            } else {
                currSum += nums[i];
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }
        System.out.print("Max Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

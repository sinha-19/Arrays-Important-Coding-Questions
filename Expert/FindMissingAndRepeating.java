public class Solution {
    /*
     * Problem: Find the missing and repeating number in the array.
     * Approach: Use mathematical formulas based on sum and sum of squares.
     *           Let x = repeating number, y = missing number.
     *           sum = sum of array elements, expectedSum = sum of 1 to n
     *           sumSq = sum of squares of array elements,
     *           expectedSq = sum of squares from 1 to n
     * 
     *           Then:
     *           diff = x - y = sum - expectedSum
     *           sqDiff = x^2 - y^2 = sumSq - expectedSq
     *           sqDiff / diff = x + y
     *           Solve to find x and y.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int[] findMissingAndRepeating(int[] nums) {
        int n = nums.length;
        long sum = 0, sumSq = 0;
        // Expected sum and sum of squares for numbers 1 to n
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSq = (long) n * (n + 1) * (2 * n + 1) / 6;
        // Calculate actual sum and sum of squares from the array
        for (int num : nums) {
            sum += num;
            sumSq += (long) num * num;
        }
        long diff = sum - expectedSum;    // x - y (repeating - missing)
        long sqDiff = sumSq - expectedSq; // x^2 - y^2
        // x + y = sqDiff / diff
        long sumXY = sqDiff / diff;
        // Solve the two equations to get repeating (x) and missing (y)
        int x = (int) ((diff + sumXY) / 2); // repeating number
        int y = (int) (x - diff);            // missing number
        return new int[]{x, y};
    }
}

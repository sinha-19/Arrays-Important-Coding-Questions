public class Solution {
    /*
     * Problem: Find the second largest element without sorting the array.
     * Approach: Single pass tracking largest and second largest values.
     * Time Complexity: O(n) — single scan.
     * Space Complexity: O(1).
     * Important: Returns -1 if second largest does not exist (e.g., all elements equal).
     */
    public int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest; // Update second largest
                largest = num;
            } else if (num > second && num != largest) {
                second = num; // Update second largest if valid
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}

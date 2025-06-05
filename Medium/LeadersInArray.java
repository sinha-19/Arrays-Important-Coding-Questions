public class Solution {
    /*
     * Problem: Find leaders in an array (elements greater than all to their right).
     * Approach: Traverse from right and keep max.
     * Time Complexity: O(n)
     * Space Complexity: O(1) if we print immediately
     */
    public void printLeaders(int[] arr) {
        int maxFromRight = arr[arr.length - 1];
        System.out.print(maxFromRight + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}

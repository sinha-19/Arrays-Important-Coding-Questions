import java.util.*;
public class Solution {
    /*
     * Problem: Count number of subarrays with given XOR equal to K.
     * Approach: Use prefix XOR and HashMap to track frequency of XOR values.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int countSubarraysWithXOR(int[] nums, int k) {
        Map<Integer, Integer> prefixXORCount = new HashMap<>();
        prefixXORCount.put(0, 1); // Base case: XOR 0 occurs once
        int xor = 0, count = 0;
        for (int num : nums) {
            xor ^= num;
            // Check how many times xor ^ k has occurred before
            int target = xor ^ k;
            count += prefixXORCount.getOrDefault(target, 0);
            // Update current prefix XOR frequency
            prefixXORCount.put(xor, prefixXORCount.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}

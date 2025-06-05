import java.util.*;
public class Solution {
    /*
     * Problem: Rearrange array with alternating positive and negative values.
     * Approach: Separate positives and negatives, then interleave.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int[] rearrange(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int num : nums) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }
        int i = 0, p = 0, n = 0;
        while (p < pos.size() && n < neg.size()) {
            nums[i++] = pos.get(p++);
            nums[i++] = neg.get(n++);
        }
        while (p < pos.size()) nums[i++] = pos.get(p++);
        while (n < neg.size()) nums[i++] = neg.get(n++);
        return nums;
    }
}

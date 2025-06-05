import java.util.*;
public class Solution {
    /*
     * Problem: Find the union of two arrays.
     * Approach: Use HashSet to store unique elements.
     * Time Complexity: O(n + m)
     * Space Complexity: O(n + m)
     */
    public List<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);
        return new ArrayList<>(set);
    }
}

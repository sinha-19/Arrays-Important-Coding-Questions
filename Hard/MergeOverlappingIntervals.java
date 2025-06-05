import java.util.*;
public class Solution {
    /*
     * Problem: Merge all overlapping intervals.
     * Approach: Sort intervals by start time and merge if overlapping.
     * Time Complexity: O(n log n) due to sorting
     * Space Complexity: O(n) for output list
     */
    public int[][] merge(int[][] intervals) {
        // Sort by starting times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            // If no overlap, add new interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Merge with previous interval
                merged.get(merged.size() - 1)[1] = 
                    Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}

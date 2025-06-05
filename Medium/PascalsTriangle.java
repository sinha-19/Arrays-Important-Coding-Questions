import java.util.*;
public class Solution {
    /*
     * Problem: Generate first n rows of Pascal's Triangle.
     * Approach: Each row[i] = row[i-1] + row[i] from prev row.
     * Time Complexity: O(n^2)
     * Space Complexity: O(n^2)
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // First element
            for (int j = 1; j < i; j++) {
                List<Integer> prev = triangle.get(i - 1);
                row.add(prev.get(j - 1) + prev.get(j));
            }
            if (i > 0) row.add(1); // Last element
            triangle.add(row);
        }
        return triangle;
    }
}

class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> s = new HashSet<>();
        int repeatedNum = 0, missingNum = 0, n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (s.contains(grid[i][j])) {
                    repeatedNum = grid[i][j];
                }
                s.add(grid[i][j]);
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (!s.contains(i)) {
                missingNum = i;
            }
        }
        return new int[] { repeatedNum, missingNum };
    }
}

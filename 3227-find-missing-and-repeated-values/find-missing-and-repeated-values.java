class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // Set<Integer> s = new HashSet<>();
        // int repeatedNum = 0, missingNum = 0, n = grid.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (s.contains(grid[i][j])) {
        //             repeatedNum = grid[i][j];
        //         }
        //         s.add(grid[i][j]);
        //     }
        // }

        // for (int i = 1; i <= n * n; i++) {
        //     if (!s.contains(i)) {
        //         missingNum = i;
        //         break;
        //     }
        // }
        // return new int[] { repeatedNum, missingNum };

        int n = grid.length;
        int tot = n * n;
        int arr[] = new int[tot + 1];
        int gridSum = 0, totalSum = ((tot * (tot + 1)) >> 1), repeatedNum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[grid[i][j]]++;
                gridSum += grid[i][j];
                if (arr[grid[i][j]] == 2) {
                    repeatedNum = grid[i][j];
                }
            }
        }
        return new int[] { repeatedNum, totalSum - gridSum + repeatedNum };
    }
}

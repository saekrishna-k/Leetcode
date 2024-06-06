class Solution {

    public int heightChecker(int[] heights) {
        int[] frequency = new int[101];

        for (int height : heights) {
            frequency[height]++;
        }

        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (frequency[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != heights[i]) {
                result++;
            }
            frequency[curHeight]--;
        }

        return result;
    }
}

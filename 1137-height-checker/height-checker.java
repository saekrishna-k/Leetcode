class Solution {

    public int heightChecker(int[] heights) {
        int count = 0;
        int[] copy = heights.clone();
        Arrays.sort(copy);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) {
                count++;
            }
        }
        return count;


        // int[] frequency = new int[101];
        // for (int height : heights) {
        //     frequency[height]++;
        // }

        // int result = 0;
        // int curHeight = 0;

        // for (int i = 0; i < heights.length; i++) {
        //     while (frequency[curHeight] == 0) {
        //         curHeight++;
        //     }

        //     if (curHeight != heights[i]) {
        //         result++;
        //     }
        //     frequency[curHeight]--;
        // }

        // return result;
    }
}

class Solution {

    public int maxProfit(int[] prices) {
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // int index = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     if (prices[i] < min) {
        //         min = prices[i];
        //         index = i;
        //         if (index == prices.length - 1) {
        //             return 0;
        //         }
        //     }
        // }

        // for (int i = index + 1; i < prices.length; i++) {
        //     if (prices[i] > max) {
        //         max = prices[i];
        //     }
        // }
        // return  max - min;

        // int maxCur = 0;
        // int maxSoFar = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     int profitToday = prices[i] - prices[i - 1];
        //     maxCur = Math.max(0, maxCur + profitToday);
        //     maxSoFar = Math.max(maxSoFar, maxCur);
        // }
        // return maxSoFar;

        int max = 0;
        int left = 0;// left - buy, right - sell
        for (int right = 1; right < prices.length; right++) {
            if (prices[right] > prices[left]) {
                max = Math.max(max, prices[right] - prices[left]);
            } else {
                left = right;
            }
        }
        return max;
    }
}

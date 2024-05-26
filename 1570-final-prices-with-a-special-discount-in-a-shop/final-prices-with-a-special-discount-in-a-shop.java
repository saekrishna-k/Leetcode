class Solution {

    public int[] finalPrices(int[] prices) {
        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i + 1; j < prices.length; j++) {
        //         if (prices[j] <= prices[i]) {
        //             prices[i] = prices[i] - prices[j];
        //             break;
        //         }
        //     }
        // }
        // return prices;

        for (int i = 0; i < prices.length; i++) {
            prices[i] = getDiscount(prices, i);
        }
        return prices;
    }

    private int getDiscount(int[] prices, int index) {
        for (int i = index + 1; i < prices.length; i++) {
            if (prices[i] <= prices[index]) {
                return prices[index] - prices[i];
            }
        }
        return prices[index];
    }
}

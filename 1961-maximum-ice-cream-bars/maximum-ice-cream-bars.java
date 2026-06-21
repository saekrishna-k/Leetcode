class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // Arrays.sort(costs);
        // int count = 0;
        // for (int cost : costs) {
        //     if (cost > coins)
        //         break;
        //     coins -= cost;
        //     count++;
        // }
        // return count;



        // int[] freq = new int[100001];
        // for(int cost : costs){
        //     freq[cost]++;
        // }
        // int count = 0;
        // for(int cost = 1 ; cost <= 100000; cost++){
        //  int canBuy = Math.min(freq[cost], coins / cost);
        //     count += canBuy;
        //     coins -= canBuy * cost;
        // }
        // return count;


        int maxCost = 0;
        for (int cost : costs) {
            maxCost = Math.max(maxCost, cost);
        }
        int[] freq = new int[maxCost + 1];
        for(int cost : costs){
            freq[cost]++;
        }
        int count = 0;
        for(int cost = 1 ; cost <= maxCost; cost++){
         int canBuy = Math.min(freq[cost], coins / cost);
            count += canBuy;
            coins -= canBuy * cost;
        }
        return count;
    }
}
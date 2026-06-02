class Solution {
    public int minimumCost(int[] cost) {
        int len = cost.length;

        Arrays.sort(cost);

        int totalCost = 0;

        for (int i = len - 1; i >= 0; i = i - 3) {
            totalCost = totalCost + cost[i];
            if (i - 1 >= 0) {
                totalCost = totalCost + cost[i - 1];
            }
        }
        return totalCost;
    }
}
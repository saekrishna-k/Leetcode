class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int l = values.length;
        int max = 0, bestLeft = values[0] + 0;
        for(int right = 1; right < l ; right++){
            int curr = bestLeft + values[right] - right;
            max = Math.max(max, curr);
            bestLeft = Math.max(bestLeft, values[right] + right);
        }
        return max;
    }
}
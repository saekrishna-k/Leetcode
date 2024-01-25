class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles, emptyBottles = 0;
        while (numBottles >= numExchange) {
            emptyBottles = numBottles % numExchange;
            numBottles /= numExchange;
            result += numBottles;
            numBottles += emptyBottles;
        }
        return result;
    }
}

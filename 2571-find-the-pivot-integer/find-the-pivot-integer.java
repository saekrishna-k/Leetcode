class Solution {

    public int pivotInteger(int n) {
        int sum = n * (n + 1) / 2, currSum = 0;
        for (int i = 1; i <= n; i++) {
            currSum += i;
            if ((sum - currSum + i) == currSum) {
                return i;
            }
        }
        return -1;
    }
}

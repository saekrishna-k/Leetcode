class Solution {

    public int tribonacci(int n) {
        // if (n == 0) {
        //     return 0;
        // }
        // if (n == 1 || n == 2) {
        //     return 1;
        // }
        // int[] result = new int[n + 1];
        // result[0] = 0;
        // result[1] = 1;
        // result[2] = 1;
        // for (int i = 3; i <= n; i++) {
        //     result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        // }
        // return result[n];

        // if (n == 1 || n == 2) return 1;
        // int a = 0, b = 1, c = 1, d = 0;
        // for (int i = 3; i <= n; i++) {
        //     d = a + b + c;
        //     a = b;
        //     b = c;
        //     c = d;
        // }
        // return d;

        int[] dp = new int[40];
        dp[0] = 0;
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}

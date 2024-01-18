class Solution {

    public int climbStairs(int n) {
        // if (n == 0 || n == 1 || n == 2) {
        //     return n;
        // }
        // return climbStairs(n - 1) + climbStairs(n - 2);

        // int[] dp = new int[n + 1];
        // dp[0] = dp[1] = 1;
        // for (int i = 2; i <= n; i++) {
        //     dp[i] = dp[i - 1] + dp[i - 2];
        // }
        // return dp[n];

        int a = 1, b = 1;
        for(int i = 1 ; i <= n - 1 ; i++){
            int temp = a;
            a = a + b;
            b = temp;
        }
        return a;
    }
}

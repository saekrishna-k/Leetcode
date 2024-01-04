class Solution {

    public int pivotInteger(int n) {
        // int sum = 0, temp = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum += i;
        // }
        // for (int i = 1; i <= n; i++) {
        //     sum -= i;
        //     if (sum == temp) {
        //         return i;
        //     } else {
        //         temp += i;
        //     }
        // }
        // return -1;

        //SQRT
        // int sum = n * (n + 1) / 2, x = (int)Math.sqrt(sum);
        // return x * x == sum ? x : -1;

        //Binary Search
        int l = 1, r = n, sum = n * (n + 1) / 2;
        while (l < r) {
            int m = (l + r) / 2;
            if (m * m - sum < 0) l = m + 1; else r = m;
        }
        return l * l - sum == 0 ? l : -1;
    }
}

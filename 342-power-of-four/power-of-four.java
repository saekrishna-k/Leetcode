class Solution {
    public boolean isPowerOfFour(int n) {
        // n = Math.abs(n);
        // if (n == 0 || n == 1) {
        //     return true;
        // }
        // while (n > 0) {
        //     if (n == 1 || n % 4 == 0) {
        //         n /= 4;
        //     } else {
        //         return false;
        //     }
        // }
        // return true;

        if (n == 0) return false;
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}
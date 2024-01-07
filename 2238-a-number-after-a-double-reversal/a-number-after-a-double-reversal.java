class Solution {

    public boolean isSameAfterReversals(int num) {
        // int n = num, r = 0, r1 = 0, i = 0;
        // if (num < 10 && num > -1) {
        //     return true;
        // }
        // while (n > 0) {
        //     i = n % 10;
        //     r = r * 10 + i;
        //     n /= 10;
        // }
        // while (r > 0) {
        //     i = r % 10;
        //     r1 = r1 * 10 + i;
        //     r /= 10;
        // }
        // if (num == r1) {
        //     return true;
        // } else {
        //     return false;
        // }

        if (num == 0 || num % 10 > 0) return true;
        return false;
    }
}

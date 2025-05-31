class Solution {

    public boolean judgeSquareSum(int c) {
        // for (long a = 0; a * a <= c; a++) {
        //     double b = Math.sqrt(c - (a * a));
        //     if (b == (int) b) {
        //         return true;
        //     }
        // }
        // return false;



        long left = 0, right = (long) Math.sqrt(c);
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum < c) {
                left++;
            } else if (sum > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public int differenceOfSums(int n, int m) {
        int ncount = 0;
        int mcount = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                ncount += i;
            } else {
                mcount += i;
            }
        }
        return mcount - ncount;
    }
}

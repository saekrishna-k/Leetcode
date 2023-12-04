class Solution {
    public boolean isPowerOfTwo(int n) {
        // n = Math.abs(n);
        return n > 0 && n != 0 && (n & (n-1)) == 0;
    }
}
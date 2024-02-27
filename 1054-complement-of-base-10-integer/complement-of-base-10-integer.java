class Solution {

    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int numberOfBits = getNumberOfBits(n);
        int mask = (1 << numberOfBits) - 1;
        return n ^ mask;
    }

    public static int getNumberOfBits(int n) {
        int count = 0;
        while (n != 0) {
            n = n >> 1;
            count++;
        }
        return count;
    }
}

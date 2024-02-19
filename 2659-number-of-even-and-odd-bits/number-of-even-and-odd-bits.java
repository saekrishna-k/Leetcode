class Solution {

    public int[] evenOddBit(int n) {
        int even = 0, odd = 0, count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                if (count % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            n /= 2;
            count++;
        }
        return new int[] { even, odd };
    }
}

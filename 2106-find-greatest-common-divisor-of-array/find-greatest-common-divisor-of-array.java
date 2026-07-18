class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE, large = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i < small) {
                small = i;
            }
            if (i > large) {
                large = i;
            }
        }

        return gcd(small, large);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
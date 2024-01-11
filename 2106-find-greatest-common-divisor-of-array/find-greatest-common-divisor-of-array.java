class Solution {

    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int gcd = 0;
        for (int i = 2; i <= max; i++) {
            if ((min % i == 0) && (max % i == 0)) {
                gcd = i;
            }
        }
        return gcd > 0 ? gcd : 1;
    }
}

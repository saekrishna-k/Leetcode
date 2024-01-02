class Solution {

    public int differenceOfSum(int[] nums) {
        int s1 = 0, s2 = 0, n = 0;

        for (int i = 0; i < nums.length; i++) {
            s1 += nums[i];
            if (nums[i] > 9) {
                n = nums[i];
                while (n > 0) {
                    s2 += n % 10;
                    n /= 10;
                }
            } else {
                s2 += nums[i];
            }
        }
        return s1 - s2;
    }
}

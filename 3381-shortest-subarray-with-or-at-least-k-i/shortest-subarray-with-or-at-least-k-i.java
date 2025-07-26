class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        for (int left = 0; left < nums.length; left++) {
            int x = 0;
            for (int right = left; right < nums.length; right++) {
                x |= nums[right];
                if (x >= k) {
                    min = Math.min(min, right - left + 1);
                    break;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
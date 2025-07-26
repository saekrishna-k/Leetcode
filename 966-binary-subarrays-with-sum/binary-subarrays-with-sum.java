class Solution {
    public int slidingWindowAtMost(int[] nums, int goal) {
        int l = nums.length, count = 0, left = 0, sum = 0;
        for (int right = 0; right < l; right++) {
            sum += nums[right];
            while (sum > goal && left <= right) {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return slidingWindowAtMost(nums, goal) - slidingWindowAtMost(nums, goal - 1);
    }
}
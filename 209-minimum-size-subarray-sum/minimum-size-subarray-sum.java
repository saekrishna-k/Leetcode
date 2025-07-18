class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int l = nums.length;
        int left = 0, minLen = Integer.MAX_VALUE, sum = 0;

        for (int right = 0; right < l; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = 0, max = 0, l = nums.length;
        for (int right = 0; right < l; right++) {
            while (nums[right] - nums[left] > 1) {
                left++;
            }
            if (nums[right] - nums[left] == 1) {
                max = Math.max(max, right - left + 1);
            }
        }
        return max;
    }
}
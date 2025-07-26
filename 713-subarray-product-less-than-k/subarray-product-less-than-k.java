class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, count = 0, l = nums.length, product = 1;

        for (int right = 0; right < l; right++) {
            product *= nums[right];
            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}

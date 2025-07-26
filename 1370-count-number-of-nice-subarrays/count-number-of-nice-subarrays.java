class Solution {
    private int numberOfAtmostSubarrays(int[] nums, int k) {
        int l = nums.length, count = 0, result = 0, left = 0;
        for (int right = 0; right < l; right++) {
            if (nums[right] % 2 == 1) {
                count++;
            }
            while (count > k) {
                if (nums[left] % 2 == 1) {
                    count--;
                }
                left++;
            }
            result = result + right - left + 1;
        }
        return result;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return numberOfAtmostSubarrays(nums, k) - numberOfAtmostSubarrays(nums, k - 1);
    }
}
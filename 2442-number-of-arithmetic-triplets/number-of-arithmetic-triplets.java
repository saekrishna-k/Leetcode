class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {
        int result = 0, l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}

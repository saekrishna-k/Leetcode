class Solution {

    public int maximumStrongPairXor(int[] nums) {
        // int result = 0, l = nums.length;
        // for (int i = 0; i < l; i++) {
        //     for (int j = 0; j < l; j++) {
        //         int d = Math.abs(nums[i] - nums[j]);
        //         if (d <= nums[i] && d <= nums[j]) {
        //             result = result > (nums[i] ^ nums[j]) ? result : nums[i] ^ nums[j];
        //         }
        //     }
        // }
        // return result;

        // int result = 0, l = nums.length;
        // for (int i = 0; i < l; i++) {
        //     for (int j = 0; j < l; j++) {
        //         if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j]))
        //         result = Math.max(result, nums[i] ^ nums[j]);
        //     }
        // }
        // return result;

        int result = 0, l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                if ((result < (nums[i] ^ nums[j])) && ((Math.abs(nums[i] - nums[j]) <= (Math.min(nums[i], nums[j]))))) result = nums[i] ^ nums[j];
            }
        }
        return result;
    }
}

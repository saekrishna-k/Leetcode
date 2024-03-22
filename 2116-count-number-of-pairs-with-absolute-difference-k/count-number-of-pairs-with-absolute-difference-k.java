class Solution {

    public int countKDifference(int[] nums, int k) {
        // int count = 0, l = nums.length;
        // for (int i = 0; i < l; i++) {
        //     for (int j = i + 1; j < l; j++) {
        //         // if (Math.abs(nums[i] - nums[j]) == k) {
        //         if (nums[i] - nums[j] == k || nums[j] - nums[i] == k) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int count = 0;
        int[] numCount = new int[101];

        for (int num : nums) {
            ++numCount[num];
        }

        for (int i = k; i <= 100; ++i) {
            count += numCount[i] * numCount[i - k];
        }

        return count;
    }
}

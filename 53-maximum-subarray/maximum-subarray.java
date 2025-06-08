class Solution {

    public int maxSubArray(int[] nums) {
        // int maxSum = Integer.MIN_VALUE, l = nums.length;
        // for (int i = 0; i < l; i++) {
        //     int currentSum = 0;
        //     for (int j = i; j < l; j++) {
        //         currentSum += nums[j];
        //         maxSum = Math.max(maxSum, currentSum);
        //     }
        // }
        // return maxSum;



        int maxSum = nums[0], currentSum = nums[0], l = nums.length;
        for (int i = 1; i < l; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

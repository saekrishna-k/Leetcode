class Solution {

    public double findMaxAverage(int[] nums, int k) {
        // int maxSum = 0;
        // int l = nums.length;
        // if (l == 1) {
        //     return (double) nums[0];
        // }
        // for (int i = 0; i <= l - k; i++) {
        //     int sum = 0;
        //     for (int j = i; j < i + k; j++) {
        //         sum += nums[j];
        //     }
        //     maxSum = sum > maxSum ? sum : maxSum;
        // }
        // return (double) maxSum / k;

        int sum = 0, l = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < l; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            maxSum = sum > maxSum ? sum : maxSum;
        }
        return (double) maxSum / k;
    }
}

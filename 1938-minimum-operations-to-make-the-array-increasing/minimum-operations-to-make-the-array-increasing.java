class Solution {

    public int minOperations(int[] nums) {
        // int noOfOperations = 0;
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         nums[i + 1]++;
        //         noOfOperations++;
        //     } else if (nums[i] > nums[i + 1]) {
        //         int diff = nums[i] - nums[i + 1] + 1;
        //         nums[i + 1] += diff;
        //         noOfOperations += diff;
        //     }
        // }
        // return noOfOperations;

        int noOfOperations = 0, max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else {
                max++;
                noOfOperations += max - nums[i];
            }
        }

        return noOfOperations;
    }
}

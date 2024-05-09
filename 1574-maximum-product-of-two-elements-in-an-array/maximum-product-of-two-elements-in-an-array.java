class Solution {

    public int maxProduct(int[] nums) {
        // int l = nums.length, max = 0;
        // for (int i = 0; i < l; i++) {
        //     for (int j = i + 1; j < l; j++) {
        //         int p = (nums[i] - 1) * (nums[j] - 1);
        //         if (p > max) {
        //             max = p;
        //         }
        //     }
        // }
        // return max;

        int max1 = 0;
        int max2 = 0;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}

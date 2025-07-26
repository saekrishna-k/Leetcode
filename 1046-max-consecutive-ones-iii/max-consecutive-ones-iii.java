class Solution {
    public int longestOnes(int[] nums, int k) {
        // int l = nums.length, count = 0, max = 0;
        // for (int i = 0; i < l; i++) {
        //     for (int j = i + 1; j < l; j++) {
        //         count = 0;
        //         for (int x = i; x <= j; x++) {
        //             if (nums[x] == 0) {
        //                 count++;
        //             }
        //         }
        //         if (count == k) {
        //             max = Math.max(max, j - i + 1);
        //         }
        //     }
        // }
        // return max;

        int l = nums.length, left = 0, count = 0, max = 0;
        for (int right = 0; right < l; right++) {
            if (nums[right] == 0) {
                count++;
            }
            while (count > k) {
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
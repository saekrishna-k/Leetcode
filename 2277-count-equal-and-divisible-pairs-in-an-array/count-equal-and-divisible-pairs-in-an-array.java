class Solution {

    public int countPairs(int[] nums, int k) {
        // int result = 0, l = nums.length;
        // for (int i = 0; i < l; i++) {
        //     for (int j = i + 1; j < l; j++) {
        //         if (nums[i] == nums[j] && (i * j) % 2 == 0) {
        //             result++;
        //         }
        //     }
        // }
        // return result;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) count++;
            }
        }
        return count;
    }
}

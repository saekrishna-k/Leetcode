class Solution {

    public int findNonMinOrMax(int[] nums) {
        // if (nums.length < 3) {
        //     return -1;
        // }
        // Arrays.sort(nums);
        // return nums[1];

        if (nums.length < 3) return -1;
        int a = Math.min(nums[0], nums[1]);
        int b = Math.max(nums[0], nums[1]);
        int c = nums[2];
        if (c > b) return b;
        if (c < a) return a;
        return c;
    }
}

class Solution {

    public int removeDuplicates(int[] nums) {
        // int index = 1;
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] != nums[i - 1]) {
        //         nums[index] = nums[i];
        //         index++;
        //     }
        // }
        // return j;

        int prev = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[prev]) {
                prev++;
                nums[prev] = nums[i];
            }
        }
        return prev + 1;
    }
}

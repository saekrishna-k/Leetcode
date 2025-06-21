class Solution {

    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0, negIndex = 1, l = nums.length;
        int[] result = new int[l];
        for (int i = 0; i < l; i++) {
            if (nums[i] > 0) {
                result[posIndex] = nums[i];
                posIndex += 2;
            } else {
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
    }
}

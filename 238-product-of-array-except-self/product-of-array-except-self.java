class Solution {

    public int[] productExceptSelf(int[] nums) {
        int product = 1, count = 0;
        for (int i : nums) {
            if (i != 0) {
                product *= i;
            } else if (i == 0) {
                ++count;
            }
        }

        int l = nums.length;
        int[] result = new int[l];
        for (int i = 0; i < l; i++) {
            if (count > 1) {
                result[i] = 0;
            } else if (nums[i] == 0) {
                result[i] = product;
            } else if (count == 1 && count != l) {
                result[i] = 0;
            } else {
                result[i] = product / nums[i];
            }
        }
        return result;
    }
}

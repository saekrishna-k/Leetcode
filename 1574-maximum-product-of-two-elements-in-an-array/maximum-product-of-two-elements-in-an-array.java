class Solution {

    public int maxProduct(int[] nums) {
        int l = nums.length, max = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                int p = (nums[i] - 1) * (nums[j] - 1);
                if (p > max) {
                    max = p;
                }
            }
        }
        return max;
    }
}

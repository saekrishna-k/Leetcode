class Solution {

    public int maxProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE, l = nums.length;

        for (int i = 0; i < l; i++) {
            int currentProd = 1;
            for (int j = i; j < l; j++) {
                currentProd *= nums[j];
                maxProd = maxProd < currentProd ? currentProd : maxProd;
            }
        }
        return maxProd;
    }
}

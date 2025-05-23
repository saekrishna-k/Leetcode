class NumArray {
    int[] prefixSum;

    public NumArray(int[] nums) {
        int l = nums.length;
        prefixSum = new int[l];
        if (l > 0) {
            prefixSum[0] = nums[0];
        }
        for (int i = 1; i < l; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left - 1];
    }
}

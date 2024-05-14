class Solution {

    public int[] numberGame(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < l - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        for (int i = 0; i < l; i = i + 2) {
            if (i + 1 < l) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        return nums;
    }
}

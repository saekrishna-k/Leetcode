class Solution {

    public int specialArray(int[] nums) {
        int count, n = nums.length;
        for (int i = 0; i <= n; i++) {
            count = 0;
            for (int j : nums) {
                if (j >= i) {
                    count++;
                }
            }
            if (count == i) {
                return count;
            }
        }
        return -1;
    }
}

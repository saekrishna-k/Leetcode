class Solution {

    public int specialArray(int[] nums) {
        int count;
        for (int i = 0; i <= nums.length; i++) {
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

class Solution {

    public int[] findErrorNums(int[] nums) {
        int duplicate = 0, missing = 0, n = nums.length;
        int[] a = new int[n + 1];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 2) {
                duplicate = i;
            }
            if (a[i] == 0) {
                missing = i;
            }
        }
        return new int[] { duplicate, missing };
    }
}

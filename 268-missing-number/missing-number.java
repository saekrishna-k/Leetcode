class Solution {

    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // for (int i = 0; i < n; i++) {
        //     if ((nums[i]) != i) {
        //         return i;
        //     }
        // }
        // return n;

        // int n = nums.length;
        // Arrays.sort(nums);
        // if (nums[0] != 0) {
        //     return 0;
        // }
        // for (int i = 0; i < n - 1; i++) {
        //     if ((nums[i] + 1) != nums[i + 1]) {
        //         return nums[i] + 1;
        //     }
        // }
        // return n;

        int n = nums.length;
        int[] a = new int[n + 1];
        int j = 0;
        while (j < n) {
            a[nums[j]] = 1;
            j++;
        }
        int c = 0;
        for (int i : a) {
            if (i == 0) return c;
            c++;
        }
        return c;
    }
}

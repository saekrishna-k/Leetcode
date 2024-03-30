class Solution {

    public int mostFrequentEven(int[] nums) {
        // int[] countNums = new int[100000];
        // int result = -1, max = 0;
        // for (int i : nums) {
        //     countNums[i]++;
        // }
        // for (int i = 0; i < 100000; i++) {
        //     if (i % 2 == 0 && max < countNums[i]) {
        //         result = i;
        //         max = countNums[i];
        //     }
        // }
        // return result != -1 ? result : -1;

        // int maxValue = Integer.MIN_VALUE;
        // for (int num : nums) {
        //     maxValue = Math.max(num, maxValue);
        // }
        // int[] countNums = new int[maxValue + 1];
        // int result = -1, max = 0;
        // for (int i : nums) {
        //     countNums[i]++;
        // }
        // for (int i = 0; i < maxValue + 1; i++) {
        //     if (i % 2 == 0 && max < countNums[i]) {
        //         result = i;
        //         max = countNums[i];
        //     }
        // }
        // return result != -1 ? result : -1;

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        int[] counts = new int[max / 2 + 1];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) continue;
            counts[nums[i] / 2]++;
            if (counts[nums[i] / 2] > counts[res] || (counts[nums[i] / 2] == counts[res] && nums[i] / 2 < res)) {
                res = nums[i] / 2;
            }
        }
        if (counts[res] == 0) return -1;
        return res * 2;
    }
}

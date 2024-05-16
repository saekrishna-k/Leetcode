class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {
        // int result = 0, l = nums.length;
        // for (int i = 0; i < l; i++) {
        //     for (int j = i + 1; j < l; j++) {
        //         for (int k = j + 1; k < l; k++) {
        //             if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
        //                 result++;
        //             }
        //         }
        //     }
        // }
        // return result;

        // int result = 0;
        // boolean[] count = new boolean[201];

        // for (int num : nums) {
        //     if (num >= 2 * diff && count[num - diff] && count[num - 2 * diff]) {
        //         result++;
        //     }
        //     count[num] = true;
        // }
        // return result;

        Set<Integer> numbers = new HashSet<>();
        int result = 0;
        for (int i : nums) {
            if (numbers.contains(i - diff) && numbers.contains(i - 2 * diff)) {
                result++;
            }
            numbers.add(i);
        }
        return result;
    }
}

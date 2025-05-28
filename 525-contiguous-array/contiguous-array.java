class Solution {

    public int findMaxLength(int[] nums) {
        // int l = nums.length;
        // int result = 0;
        // for (int i = 0; i < l; i++) {
        //     int c1 = 0, c0 = 0;
        //     for (int j = i; j < l; j++) {
        //         if (nums[j] == 0) {
        //             c0++;
        //         } else {
        //             c1++;
        //         }
        //         if (c1 == c0) {
        //             result = Math.max(result, j - i + 1);
        //         }
        //     }
        // }
        // return result;

        Map<Integer, Integer> m = new HashMap<>();
        int l = nums.length, count = 0, max_length = 0;
        m.put(0, -1);
        for (int i = 0; i < l; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }
            if (m.containsKey(count)) {
                max_length = Math.max(max_length, i - m.get(count));
            } else {
                m.put(count, i);
            }
        }
        return max_length;
    }
}

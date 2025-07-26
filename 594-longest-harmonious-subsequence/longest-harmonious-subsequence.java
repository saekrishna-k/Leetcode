class Solution {

    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = 0, max = 0, l = nums.length;
        for (int right = 0; right < l; right++) {
            while (nums[right] - nums[left] > 1) {
                left++;
            }
            if (nums[right] - nums[left] == 1) {
                max = Math.max(max, right - left + 1);
            }
        }
        return max;

        // int max = 0;
        // Map<Integer, Integer> freq = new HashMap<>();
        // for (int n : nums) {
        //     freq.put(n, freq.getOrDefault(n, 0) + 1);
        // }

        // for (int n : freq.keySet()) {
        //     if (freq.containsKey(n + 1)) {
        //         int len = freq.get(n) + freq.get(n + 1);
        //         max = Math.max(max, len);
        //     }
        // }
        // return max;
    }
}

class Solution {

    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        // int n = nums.length;
        // int x = n / 2;
        // Map<Integer, Integer> m = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> e : m.entrySet()) {
        //     if (e.getValue() > x) {
        //         return e.getKey();
        //     }
        // }
        // return 0;

        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

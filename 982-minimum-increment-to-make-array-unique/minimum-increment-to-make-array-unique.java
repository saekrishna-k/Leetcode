class Solution {

    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) return 0;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
        }
        int[] frequency = new int[max + n];
        for (int i : nums) {
            frequency[i]++;
        }

        int moves = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] <= 1) {
                continue;
            }
            int remain = frequency[i] - 1;
            moves = moves + remain;
            frequency[i + 1] += remain;
        }
        return moves;
    }
}

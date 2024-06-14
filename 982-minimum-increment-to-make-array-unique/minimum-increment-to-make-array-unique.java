class Solution {

    public int minIncrementForUnique(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] frequency = new int[1000000];
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

class Solution {

    public int maximizeSum(int[] nums, int k) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = max < i ? i : max;
        }

        for (int j = 0; j < k; j++) {
            sum += max;
            max += 1;
        }
        return sum;
    }
}

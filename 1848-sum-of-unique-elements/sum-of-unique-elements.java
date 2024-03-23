class Solution {

    public int sumOfUnique(int[] nums) {
        int[] countNums = new int[101];
        int sum = 0;
        for (int i : nums) {
            countNums[i]++;
        }

        for (int i = 0; i < 101; i++) {
            if (countNums[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}

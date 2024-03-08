class Solution {

    public int maxFrequencyElements(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxNum) maxNum = num;
        }

        int[] n = new int[maxNum + 1];
        for (int i : nums) {
            n[i]++;
        }

        int max = 0;
        for (int i : n) {
            if (max < i) {
                max = i;
            }
        }

        int result = 0;
        for (int i : n) {
            if (i == max) {
                result += max;
            }
        }
        return result;
    }
}

class Solution {

    public int maxFrequencyElements(int[] nums) {
        int[] n = new int[101];
        for (int i : nums) {
            n[i]++;
        }
        int max = 0;
        for (int i = 0; i < 101; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        int result = 0;
        for (int i = 0; i < 101; i++) {
            if (n[i] == max) {
                result += max;
            }
        }
        return result;
    }
}

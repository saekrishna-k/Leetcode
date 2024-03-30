class Solution {

    public int mostFrequentEven(int[] nums) {
        int[] countNums = new int[100000];
        int result = -1, max = 0;
        for (int i : nums) {
            countNums[i]++;
        }
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0 && max < countNums[i]) {
                result = i;
                max = countNums[i];
            }
        }
        return result != -1 ? result : -1;
    }
}

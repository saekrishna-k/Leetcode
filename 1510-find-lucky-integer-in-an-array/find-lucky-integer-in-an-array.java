class Solution {

    public int findLucky(int[] arr) {
        int[] countNums = new int[501];
        for (int i : arr) {
            countNums[i]++;
        }

        for (int i = 500; i > 0; i--) {
            if (i == countNums[i]) {
                return i;
            }
        }
        return -1;
    }
}

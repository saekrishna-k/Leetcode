class Solution {

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int j = i;
            int count = 0;
            while (j > 0) {
                if (j % 2 == 1) {
                    count++;
                }
                j = j >> 1;
            }
            result[i] = count;
        }
        return result;
    }
}

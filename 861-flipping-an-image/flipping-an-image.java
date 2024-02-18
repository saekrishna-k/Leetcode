class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            int index = 0;
            for (int j = n - 1; j > -1; j--) {
                result[i][index] = image[i][j] ^ 1;
                index++;
            }
        }
        return result;
    }
}

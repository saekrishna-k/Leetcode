class Solution {

    public int diagonalSum(int[][] mat) {
        // int result = 0, l = mat.length;
        // for (int i = 0; i < l; i++) {
        //     for (int j = 0; j < l; j++) {
        //         if (i == j || (i + j) == (l - 1)) {
        //             result += mat[i][j];
        //         }
        //     }
        // }
        // return result;

        int result = 0, l = mat.length;
        for (int i = 0; i < l; i++) {
            //pd
            result += mat[i][i];
            //sd
            if (i != l - 1 - i) {
                result += mat[i][l - 1 - i];
            }
        }
        return result;
    }
}

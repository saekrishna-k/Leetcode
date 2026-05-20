class Solution {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int freq[] = new int[len + 1];
        int count = 0;
        int sol[] = new int[len];
        for (int i = 0; i < len; i++) {
            if (++freq[A[i]] == 2) count++;
            if (++freq[B[i]] == 2) count++;
            sol[i] = count;
        }
        return sol;
    }
}

class Solution {

    public int[] sumZero(int n) {
        // int[] result = new int[n];
        // for (int i = 0; i < n; i++) result[i] = i * 2 - n + 1;
        // return result;

        int[] result = new int[n];
        int left = 0, right = n - 1, start = 1;
        while (left < right) {
            result[left++] = start;
            result[right--] = -start;
            start++;
        }
        return result;
    }
}

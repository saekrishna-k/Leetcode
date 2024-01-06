class Solution {

    public int minimumSum(int num) {
        int[] a = { 0, 0, 0, 0 };
        a[0] = num % 10;
        num /= 10;
        a[1] = num % 10;
        num /= 10;
        a[2] = num % 10;
        num /= 10;
        a[3] = num % 10;
        Arrays.sort(a);
        return ((a[0] + a[1]) * 10 + a[2] + a[3]);
    }
}

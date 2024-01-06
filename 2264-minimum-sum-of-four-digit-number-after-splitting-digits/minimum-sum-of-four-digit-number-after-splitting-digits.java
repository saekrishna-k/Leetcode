class Solution {

    public int minimumSum(int num) {
        // int sum = 0, min = 0, num1 = 0;
        // while (num > 0) {
        //     num1 = num1 * 10 + num % 10;
        //     sum = num + num1;
        //     if (sum < min) {
        //         min = sum;
        //     }
        //     num /= 10;
        // }
        // return min;

        int[] a = {0,0,0,0};
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

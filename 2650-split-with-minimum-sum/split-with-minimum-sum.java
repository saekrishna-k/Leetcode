class Solution {

    public int splitNum(int num) {
        int[] n = new int[String.valueOf(num).length()];
        int a = num, i = 0, num1 = 0, num2 = 0;
        while (a > 0) {
            int c = a % 10;
            n[i] = c;
            a /= 10;
            i++;
        }
        Arrays.sort(n);
        for (int j = 0; j < n.length; j++) {
            if (j % 2 == 0) {
                num1 = num1 * 10 + n[j];
            } else {
                num2 = num2 * 10 + n[j];
            }
        }
        // for (int j = 0; j < n.length; j = j + 2) {
        //     num1 = num1 * 10 + n[j];
        // }
        // for (int j = 1; j < n.length; j = j + 2) {
        //     num2 = num2 * 10 + n[j];
        // }
        return num1 + num2;
    }
}

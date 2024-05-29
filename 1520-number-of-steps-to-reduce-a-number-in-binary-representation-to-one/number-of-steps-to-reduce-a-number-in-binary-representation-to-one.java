class Solution {

    public int numSteps(String s) {
        // int n = 0, k = 0, count = 0;
        // for (int i = s.length() - 1; i > -1; i--) {
        //     int j = s.charAt(i) - '0';
        //     n += j * Math.pow(2, k);
        //     k++;
        // }

        // while (n != 1) {
        //     if (n % 2 == 0) {
        //         n /= 2;
        //     } else {
        //         n += 1;
        //     }
        //     count++;
        // }
        // return count;

        // int n = s.length();
        // int carry = 0;
        // int count = 0;
        // for (int i = n - 1; i >= 1; i--) {
        //     if (s.charAt(i) - '0' + carry == 1) {
        //         carry = 1;
        //         count += 2;
        //     } else {
        //         count += 1;
        //     }
        // }
        // return count + carry;

        int count = 0, carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            count++;
            if (s.charAt(i) - '0' + carry == 1) {
                carry = 1;
                count++;
            }
        }
        return count + carry;
    }
}

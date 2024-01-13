class Solution {

    public int countEven(int num) {
        int c = 0;
        for (int i = 1; i <= num; i++) {
            int j = i, sum = 0;
            while (j != 0) {
                sum += j % 10;
                j /= 10;
            }
            if (sum % 2 == 0) {
                c++;
            }
        }
        return c;
    }
}

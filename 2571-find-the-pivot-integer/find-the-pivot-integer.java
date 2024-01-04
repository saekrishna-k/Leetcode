class Solution {

    public int pivotInteger(int n) {
        int sum = 0, temp = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        for (int i = 1; i <= n; i++) {
            sum -= i;
            if (sum == temp) {
                return i;
            } else {
                temp += i;
            }
        }
        return -1;
    }
}

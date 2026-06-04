class Solution {

    public int m1(int num) {
        int count = 0;
        int last = num % 10;
        num /= 10;
        int curr = num % 10, next;
        num /= 10;
        while (num > 0) {
            next = num % 10;
            num /= 10;
            if ((curr > last && curr > next) || (curr < last && curr < next)) {
                count++;
            }
            last = curr;
            curr = next;
        }
        return count;
    }

    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            if (i < 100) continue;
            count += m1(i);
        }
        return count;
    }
}

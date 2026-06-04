class Solution {

    public int m1(int num) {
        int count = 0;
        int first = -1, second = -1, third = -1;
        while (num > 0) {
            third = second;
            second = first;
            first = num % 10;
            if (second != -1 && third != -1) {
                if (first > second && second < third) {
                    count++;
                }
                if (first < second && second > third) {
                    count++;
                }
            }
            num /= 10;
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

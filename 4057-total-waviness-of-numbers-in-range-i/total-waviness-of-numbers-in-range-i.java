class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            int j = i;
            int first = -1, second = -1, third = -1;
            while (j > 0) {
                third = second;
                second = first;
                first = j % 10;
                if (second != -1 && third != -1) {
                    if (first > second && second < third) {
                        count++;
                    }
                    if (first < second && second > third) {
                        count++;
                    }
                }
                j /= 10;
            }
        }
        return count;
    }
}
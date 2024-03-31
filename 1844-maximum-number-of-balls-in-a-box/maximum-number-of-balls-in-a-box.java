class Solution {

    public int countBalls(int lowLimit, int highLimit) {
        int[] boxes = new int[46];
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int j = i, sum = 0;
            while (j > 0) {
                sum += j % 10;
                j /= 10;
            }
            max = max < ++boxes[sum] ? boxes[sum] : max;
        }
        return max;
    }
}

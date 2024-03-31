class Solution {

    public int countBalls(int lowLimit, int highLimit) {
        // int[] boxes = new int[46];
        // int max = 0;
        // for (int i = lowLimit; i <= highLimit; i++) {
        //     int j = i, sum = 0;
        //     while (j > 0) {
        //         sum += j % 10;
        //         j /= 10;
        //     }
        //     max = max < ++boxes[sum] ? boxes[sum] : max;
        // }
        // return max;

        int[] box = new int[46];
        int lo = lowLimit, id = 0;
        while (lo > 0) { // compute box id for lowLimit.
            id += lo % 10;
            lo /= 10;
        }
        box[id]++;
        id++;

        for (int i = lowLimit + 1; i <= highLimit; i++) {
            int digits = i;
            while (digits % 10 == 0) {
                // for ball numbers with trailing 0's, decrease 9 for each 0.
                id -= 9;
                digits /= 10;
            }
            box[id]++;
            id++;
        }
        int res = 0;
        for (int b : box) {
            res = Math.max(res, b);
        }
        return res;
    }
}

class Solution {

    public int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max2) {
                if (i > max1) {
                    max2 = max1;
                    max1 = i;
                } else {
                    max2 = i;
                }
            }

            if (i < min2) {
                if (i < min1) {
                    min2 = min1;
                    min1 = i;
                } else {
                    min2 = i;
                }
            }
        }
        return (max1 * max2) - (min1 * min2);
    }
}

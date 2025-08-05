class Solution {

    public int maxProduct(int[] nums) {
        // int maxProd = Integer.MIN_VALUE, l = nums.length;
        // for (int i = 0; i < l; i++) {
        //     int currentProd = 1;
        //     for (int j = i; j < l; j++) {
        //         currentProd *= nums[j];
        //         maxProd = maxProd < currentProd ? currentProd : maxProd;
        //     }
        // }
        // return maxProd;

        int max, min, result;
        max = min = result = nums[0];
        int l = nums.length;

        for (int i = 1; i < l; i++) {
            int num = nums[i];
            if (num < 0) {
                // max = max + min;
                // min = max - min;
                // max = max - min;

                max = max ^ min;
                min = max ^ min;
                max = max ^ min;
            }

            max = Math.max(num, max * num);
            min = Math.min(num, min * num);
            result = Math.max(result, max);
        }
        return result;
    }
}

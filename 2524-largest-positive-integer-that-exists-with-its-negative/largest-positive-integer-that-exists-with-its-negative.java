class Solution {

    public int findMaxK(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // int max = 0;
        // for (int i : nums) {
        //     int j;
        //     if (i > 0) {
        //         j = -i;
        //     } else {
        //         j = Math.abs(i);
        //     }
        //     if (map.containsKey(j)) {
        //         if (j < 0) {
        //             max = max < i ? i : max;
        //         } else {
        //             max = max < j ? j : max;
        //         }
        //     }
        //     if (!map.containsKey(i)) {
        //         map.put(i, 0);
        //     }
        // }
        // return max == 0 ? -1 : max;

        int[] sum = new int[1001];
        int max = -1;
        for (int i : nums) {
            int index = i > 0 ? i : -i;
            if (sum[index] != i) {
                sum[index] += i;
            }
            if (sum[index] == 0) {
                max = max > index ? max : index;
            }
        }
        return max;
    }
}

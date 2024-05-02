class Solution {

    public int findMaxK(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i : nums) {
            int j;
            if (i > 0) {
                j = -i;
            } else {
                j = Math.abs(i);
            }
            if (map.containsKey(j)) {
                if (j < 0) {
                    max = max < i ? i : max;
                } else {
                    max = max < j ? j : max;
                }
            }
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
        }
        return max == 0 ? -1 : max;
    }
}

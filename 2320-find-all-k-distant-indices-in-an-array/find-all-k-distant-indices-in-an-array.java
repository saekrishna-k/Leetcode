class Solution {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int l = nums.length;
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < l; i++) {
            boolean flag = false;
            for (int j = 0; j < l; j++) {
                if (nums[j] == key && Math.abs(i - j) <= k) {
                    result.add(i);
                    flag = !flag;
                }
                if (flag) {
                    break;
                }
            }
        }

        return result;
    }
}

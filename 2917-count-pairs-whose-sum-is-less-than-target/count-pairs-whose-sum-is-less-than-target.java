class Solution {

    public int countPairs(List<Integer> nums, int target) {
        int result = 0, l = nums.size();
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                int sum = nums.get(i) + nums.get(j);
                if (sum < target) {
                    result++;
                }
            }
        }
        return result;
    }
}

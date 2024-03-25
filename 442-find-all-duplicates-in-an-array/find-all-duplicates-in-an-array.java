class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        int l = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) result.add(index + 1);
            nums[index] = -nums[index];
        }
        return result;
    }
}

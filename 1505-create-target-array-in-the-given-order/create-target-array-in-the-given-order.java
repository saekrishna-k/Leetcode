class Solution {

    public int[] createTargetArray(int[] nums, int[] index) {
        int l = nums.length;
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < l; i++) {
            result.add(index[i], nums[i]);
        }

        return result.stream().mapToInt(x -> x).toArray();
    }
}

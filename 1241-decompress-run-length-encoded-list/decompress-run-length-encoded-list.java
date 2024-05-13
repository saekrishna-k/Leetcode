class Solution {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            int index = i + 1;
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[index]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

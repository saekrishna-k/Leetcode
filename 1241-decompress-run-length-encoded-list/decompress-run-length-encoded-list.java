class Solution {

    public int[] decompressRLElist(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < nums.length - 1; i = i + 2) {
        //     int index = i + 1;
        //     for (int j = 0; j < nums[i]; j++) {
        //         list.add(nums[index]);
        //     }
        // }
        // return list.stream().mapToInt(Integer::intValue).toArray();

        int size = 0, l = nums.length;
        for (int i = 0; i < nums.length; i = i + 2) {
            size = size + nums[i];
        }
        int[] result = new int[size];
        int start = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            Arrays.fill(result, start, start + nums[i], nums[i + 1]);
            start = start + nums[i];
        }
        return result;
    }
}

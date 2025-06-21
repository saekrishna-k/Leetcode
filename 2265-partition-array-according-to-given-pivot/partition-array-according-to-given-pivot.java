class Solution {

    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lesser = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        int count = 0;

        for (int i : nums) {
            if (i > pivot) {
                greater.add(i);
            } else if (i < pivot) {
                lesser.add(i);
            } else {
                count++;
            }
        }
        int index = 0;
        for (int i : lesser) {
            nums[index++] = i;
        }

        for (int i = 0 ; i < count ; i++) {
            nums[index++] = pivot;
        }

        for (int i : greater) {
            nums[index++] = i;
        }

        return nums;
    }
}

class Solution {

    public int[] pivotArray(int[] nums, int pivot) {
        // List<Integer> lesser = new ArrayList<>();
        // List<Integer> greater = new ArrayList<>();
        // int count = 0;

        // for (int i : nums) {
        //     if (i > pivot) {
        //         greater.add(i);
        //     } else if (i < pivot) {
        //         lesser.add(i);
        //     } else {
        //         count++;
        //     }
        // }
        // int index = 0;
        // for (int i : lesser) {
        //     nums[index++] = i;
        // }

        // for (int i = 0 ; i < count ; i++) {
        //     nums[index++] = pivot;
        // }

        // for (int i : greater) {
        //     nums[index++] = i;
        // }

        // return nums;

        

        int l = nums.length;
        int[] lesser = new int[l];
        int[] greater = new int[l];
        int lc = 0, gc = 0, pc = 0;

        for (int i : nums) {
            if (i > pivot) {
                greater[gc++] = i;
            } else if (i < pivot) {
                lesser[lc++] = i;
            } else {
                pc++;
            }
        }

        for (int i = 0; i < pc; i++) {
            lesser[lc++] = pivot;
        }

        for (int i = 0; i < gc; i++) {
            lesser[lc++] = greater[i];
        }

        return lesser;
    }
}

class Solution {

    public void sortColors(int[] nums) {
        // int start = 0, mid = 0, end = nums.length - 1;
        // while (mid <= end) {
        //     switch (nums[mid]) {
        //         case 0:
        //             swap(nums, start, mid);
        //             start++;
        //             mid++;
        //             break;
        //         case 1:
        //             mid++;
        //             break;
        //         case 2:
        //             swap(nums, mid, end);
        //             end--;
        //             break;
        //     }
        // }

        int y = 0, z = nums.length - 1;
        for (int x = 0; x <= z; x++) {
            if (nums[x] == 0) {
                swap(nums, x, y++);
            } else if (nums[x] == 2) {
                swap(nums, x--, z--);
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

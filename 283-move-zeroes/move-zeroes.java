class Solution {

    public void moveZeroes(int[] nums) {
        // int j = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         nums[j++] = nums[i];
        //     }
        // }
        // while (j < nums.length) {
        //     nums[j++] = 0;
        // }

        // int index = -1;
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] == 0){
        //         index = i;
        //         break;
        //     }
        // }

        // if(index == -1) return;

        // for(int i = index + 1; i < nums.length ; i++){
        //     if(nums[i] != 0){
        //         nums[index] = nums[i];
        //         nums[i] = 0;
        //         index++;
        //     }
        // }



        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }



        // int slow = 0;
        // for (int fast = 0; fast < nums.length; fast++) {
        //     if (nums[fast] != 0 && nums[slow] == 0) {
        //         int temp = nums[slow];
        //         nums[slow] = nums[fast];
        //         nums[fast] = temp;
        //     }
        //     if (nums[slow] != 0) {
        //         slow++;
        //     }
        // }
    }
}

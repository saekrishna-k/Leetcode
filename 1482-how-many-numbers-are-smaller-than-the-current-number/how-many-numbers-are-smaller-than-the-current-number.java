class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    //   int[] ans = new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         int cnt=0;
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[j]<nums[i]){
    //                 cnt++;
    //             }
    //         }
    //         ans[i]=cnt;
    //     }
    //     return ans;


        int[] hash = new int[101];
        for(int i = 0 ; i < nums.length ; i++){
            hash[nums[i]] += 1;
        }

        for(int i = 1 ; i < 101 ; i++){
            hash[i] = hash[i-1] + hash[i]; 
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] == 0 ? 0 : hash[nums[i] - 1];
        }
        return nums;
    }
}
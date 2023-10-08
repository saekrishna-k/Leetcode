class Solution {
    public int[] leftRightDifference(int[] nums) {
        // int l = nums.length;
        // int[] rs = new int[l];
        // int[] ls = new int[l];
        // for(int i = 1 ; i < l ; i++){
        //     rs[i] = rs[i-1] + nums[i-1];
        // }

        // for(int i = l-2 ; i >= 0 ; i--){
        //     ls[i] = ls[i+1] + nums[i+1];
        // }

        // for(int i = 0 ; i < l ; i++){
        //     rs[i] = Math.abs(rs[i] - ls[i]);
        // }
        // return rs;

        int rs =0;
        int ls =0;
        int [] answer = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            rs+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            rs-=nums[i];
            answer[i] = Math.abs(rs-ls);
            ls+=nums[i];
        }
        return answer ;
    }
}
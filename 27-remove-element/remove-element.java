class Solution {
    public int removeElement(int[] nums, int val) {
        int i,l=nums.length,c=0;
        for(i=0;i<l;i++)
        {
            if(nums[i]!=val){
              nums[c]=nums[i];
                c++;
               
            }
                
        }
        return c;
    }
}
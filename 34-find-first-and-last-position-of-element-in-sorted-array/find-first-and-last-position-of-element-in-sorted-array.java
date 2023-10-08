class Solution {
    public int[] searchRange(int[] nums, int target) {
         int ans[] = {-1,-1};
        ans[0] = findNum(nums,target,true);
        if(ans[0] != -1){
            ans[1]= findNum(nums,target,false);
        }
        return ans;
        }
    public int findNum(int[] nums, int target, boolean findFirst){
        int start  = 0, end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end  = mid -1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(findFirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
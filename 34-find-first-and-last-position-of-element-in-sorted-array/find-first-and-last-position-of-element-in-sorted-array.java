class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = bsearch(nums,target,true);
        ans[1] = bsearch(nums,target, false);
        return ans;
    }

    public int bsearch(int[] nums, int target, boolean indexFirst){
        int res = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(target > nums[mid]){
                start = mid+1;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{
                res = mid;
                if(indexFirst){
                    end = mid-1;
                }else{
                    start =mid+1;
                }
            }
        }
        return res;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int ct=0;
        for(int i=1; i<nums.length; i++){
            if(nums[ct] != nums[i]){
                ct++;
                nums[ct] = nums[i];
            }
        }
        return ct+1;
    }
}
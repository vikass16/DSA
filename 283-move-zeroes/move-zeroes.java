class Solution {
    public void moveZeroes(int[] nums) {
        int ct = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[ct++]=nums[i];
            }
        }
        while(ct < nums.length){
            nums[ct++]=0;
        }
    }
}
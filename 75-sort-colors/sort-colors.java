class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int start = 0;
        int end = nums.length-1;
        while(i <= end){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
                i++;
            }else if(nums[i] == 1){
                i++;
            }else{
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
}
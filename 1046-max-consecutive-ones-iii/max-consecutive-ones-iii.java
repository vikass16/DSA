class Solution {
    public int longestOnes(int[] nums, int k) {
        

        int left = 0;
        int count = 0;
        int max =Integer.MIN_VALUE;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] == 0){
                count++;
            }

            while(count > k){
                if(nums[left++] == 0){
                    count--;
                }
            }
            max = Math.max(max, r -left+1);
        }
        return max;
    }
}
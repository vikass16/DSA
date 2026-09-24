class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;
        int max = Integer.MAX_VALUE;
        int sum = 0;
       for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                 max = Math.min(max, right-left+1);
                sum -=nums[left++];
            }

        }
        return max == Integer.MAX_VALUE ? 0 : max;
    }
}
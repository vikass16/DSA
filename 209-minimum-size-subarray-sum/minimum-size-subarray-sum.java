class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                min = Math.min(min, right-l+1);
                sum -= nums[l++];
                
            }

        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
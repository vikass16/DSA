class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        int res = sum;
        int left = 0;
        for(int i=k; i<nums.length; i++){
            res += nums[i] - nums[left++];
            sum = Math.max(res, sum);
        }
        return (double) sum/k;
    }
}
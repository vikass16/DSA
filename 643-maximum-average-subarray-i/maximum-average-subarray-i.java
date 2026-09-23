class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double res = sum;
        //double max = 0.0;
        int left = 0;
        for(int i=k; i<nums.length; i++){
            res += nums[i] - nums[left++];
            sum = Math.max(res, sum);
        }
        return sum/k;
    }
}
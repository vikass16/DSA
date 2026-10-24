class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0; i<k;i++){
            sum += nums[i];
        }
        int left = 0;
        
        double res = sum;

        for(int i=k; i<nums.length; i++){
            
            res += nums[i];
            res -= nums[left++];
            sum = Math.max(res, sum);
        }
        return sum/k;
    }
}
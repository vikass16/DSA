class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int left = 0;
        int res = sum;
        for(int right=k; right<nums.length; right++){
            res += nums[right]-nums[left++];
            sum = Math.max(sum,res);
        }
        return (double) sum/k;
    }
}
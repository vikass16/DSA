class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int n:nums){
            currentSum += n;
            currentSum = Math.max(currentSum, n);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length; 
         int totalSum = (n * (n+1)) /2;
         int actualSum = 0;
         for(int i:nums){
             actualSum += i;
         }

         return totalSum - actualSum;
    }
}
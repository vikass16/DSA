class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int currentSum = 0;
        int preSum = 0;

        for(int n : nums){
            currentSum += n;

            if(set.contains(currentSum % k)){
                return true;
            }

            currentSum %= k;
            set.add(preSum);
            preSum = currentSum;
        }
        return false;
    }
}
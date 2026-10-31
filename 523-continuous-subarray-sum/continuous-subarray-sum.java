class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int preSum=0;
        for(int i : nums){
            sum += i;
            if(set.contains(sum%k)){
                return true;
            }

            sum = sum%k;
            set.add(preSum);
            preSum = sum;
        }
        return false;
    }
}
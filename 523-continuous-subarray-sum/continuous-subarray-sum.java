class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int CurrSum = 0;
        int PreSum = 0;
        for(int n: nums){
            CurrSum += n;

            if(set.contains(CurrSum % k)){
                return true;
            }

            CurrSum %= k;
            set.add(PreSum);
            PreSum = CurrSum;
        }
        return false;
    }
}
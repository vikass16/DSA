class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum =0;
        int res = 0;
        for(int i : nums){
            sum += i;

            if(map.containsKey(sum-goal)){
                res += map.get(sum-goal); 
            }
           map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
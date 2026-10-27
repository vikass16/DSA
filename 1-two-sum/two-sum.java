class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int index = nums[i];
            int res = target-index;

            if(map.containsKey(index)){
                return new int[]{i, map.get(index)};
            }
            map.put(res,i);
        }
        return new int[]{};
    }
}
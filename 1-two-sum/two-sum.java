class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int index = nums[i];
            int rem = target-index;

            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(index, i);
        }
        return new int[]{};
    }
}
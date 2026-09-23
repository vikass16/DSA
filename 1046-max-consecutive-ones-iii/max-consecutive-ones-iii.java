class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int j = 0;
        int count = 0;
        int max = 0;
        while(j < nums.length){
            if(nums[j] == 0){
                count++;
            }

            while(count > k){
                if(nums[left++] == 0){
                    count--;
                }
            }
             
            max = Math.max(max, j-left+1);
          j++;
        }
        return max;
    }
}
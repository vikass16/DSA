class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int n:nums){
            if(n > max){
                max = n;
            }
        }

        int sum = 0;
        for(int n : nums){
            sum = sum + (max-n);
        }

        return sum;
    }
}
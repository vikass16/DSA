class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] freq = new int[101];

        for(int i:nums){
            freq[i]++;
        }

        for(int i:nums){
            if(freq[i]==1 && i%2==0){
                return i;
            }
        }
        return -1;
    }
}
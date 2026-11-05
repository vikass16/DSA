class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[128];
        int maxFreq = 0;
        int max = Integer.MIN_VALUE;
        int left= 0;

        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right)]++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right)]);

            if((right - left + 1) - maxFreq > k){
                freq[s.charAt(left)]--;
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
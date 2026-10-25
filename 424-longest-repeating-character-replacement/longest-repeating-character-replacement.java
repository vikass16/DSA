class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq=0, max=0, left=0;
        int[] count = new int[26];
        for(int right = 0; right < s.length(); right++){
            count[s.charAt(right)-'A']++;

            maxFreq = Math.max(maxFreq, count[s.charAt(right)-'A']);

            if((right-left+1) - maxFreq > k){
                count[s.charAt(left)-'A']--;
                left++;
            }

            max = Math.max(max, right-left+1);
        }
        return max;
    }
}
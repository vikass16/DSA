class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq =0, left =0, max=0;

        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            count[ch-'A']++;

            maxFreq = Math.max(maxFreq, count[ch-'A']);
            if((i-left+1)- maxFreq > k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            max = Math.max(max, i-left+1);
        }
        return max;
    }
}
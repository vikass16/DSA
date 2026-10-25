class Solution {
    public int characterReplacement(String s, int k) {
       int maxfreq = 0;
       int left = 0;
       int max = 0;
       int[] count = new int[26];

       for(int right =0; right<s.length(); right++){
          count[s.charAt(right)-'A']++;
          maxfreq = Math.max(maxfreq, count[s.charAt(right)-'A']);

          while((right -left +1)-maxfreq > k){
            count[s.charAt(left)-'A']--;
            left++;
          }
          max = Math.max(max, right-left+1);
       } 
       return max;
    }
}

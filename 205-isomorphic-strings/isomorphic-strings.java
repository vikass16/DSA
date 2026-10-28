class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[128];
        int[] freq1 = new int[128];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);

            if(freq[ch] != freq1[ch1]){
                return false;
            }
            freq[ch] = i+1;
            freq1[ch1] = i+1;
        }
        return true;
    }
}
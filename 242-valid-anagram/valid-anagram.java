class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[128];

        for(char ch : s.toCharArray()){
            freq[ch-'A']++;
        }
        for(char ch1 : t.toCharArray()){
            freq[ch1-'A']--;
        }

        for(int i : freq){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
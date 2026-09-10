class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] freq1 = new char[26];

        for(char ch : s.toCharArray()){
            freq1[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            freq1[ch - 'a']--;
        }

        for(int count : freq1){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
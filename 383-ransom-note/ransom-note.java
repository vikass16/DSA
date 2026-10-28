class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        int[] freq = new int[128];
        for(char ch : magazine.toCharArray()){
            freq[ch-'A']++;
        }

        for(char ch : ransomNote.toCharArray()){
            freq[ch-'A']--;
            if(freq[ch-'A'] < 0){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[128];

        for(char ch : magazine.toCharArray()){
            freq[ch]++;
        }

        for(char ch : ransomNote.toCharArray()){
            freq[ch]--;
            if(freq[ch] < 0){
                return false;
            }
        }
        return true;
    }
}
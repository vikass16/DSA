class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[128];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
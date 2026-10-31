class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char ch:word1.toCharArray()){
            freq1[ch-'a']++;
        }
        for(char ch : word2.toCharArray()){
            freq2[ch-'a']++;
        }

        for(int i=0; i<26; i++){
            if((freq1[i]>0 && freq2[i] == 0) || freq2[i]>0 && freq1[i]==0){
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}

// Step1 : create two freq array
// Step2 : run a for loop till 26 and check 
// Step3 : sort both Arrays
// Step4 : Again run a loop


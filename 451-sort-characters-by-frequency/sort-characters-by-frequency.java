class Solution {
    public String frequencySort(String s) {
        
        int freq[] = new int[256];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }

        int max = 0;
        for(int i=0; i<256; i++){
            max = Math.max(max, freq[i]);
        }

        StringBuilder sb = new StringBuilder();

        for(int f = max; f >= 1; f--){
            for(int i=0; i<256; i++){
                if(freq[i] == f){
                    char c = (char)i;
                    for(int j=0; j<f; j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
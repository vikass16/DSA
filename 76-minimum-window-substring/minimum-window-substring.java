class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        int[] window = new int[128];

        int required = 0;

        for(char ch : t.toCharArray()){
            need[ch]++;
        }

        for(int i=0; i<128; i++){
            if(need[i] > 0){
                required++;
            }
        }

        int left = 0;
        int formed = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        for(int right = 0; right< s.length(); right++){
            char chRight = s.charAt(right);
            window[chRight]++;

            if(need[chRight] > 0 && window[chRight] == need[chRight]){
                formed++;
            }

            while(formed == required){

                if(right-left+1 < minLength){
                    minLength = right-left+1;
                    startIndex = left;
                }
                char chLeft = s.charAt(left);

                if(need[chLeft] > 0 && window[chLeft] == need[chLeft]){
                    formed--;
                }
                window[chLeft]--;
                left++;
            }
        }
        if(minLength == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(startIndex, startIndex+minLength);
    }
}
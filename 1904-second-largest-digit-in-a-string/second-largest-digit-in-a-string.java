class Solution {
    public int secondHighest(String s) {
        int large = -1;
        int second = -1;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= '0' && ch <= '9'){
                int digit = ch - '0';
                if(digit > large){
                    second = large;
                    large = digit;
                }else if(digit > second && digit != large){
                    second = digit;
                }
            }
        }
        return second;
    }
}
class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String st = "";
        for(int i=str.length-1; i>=0; i--){
            st += str[i];
            if(i>0){
                st += " ";
            }
        }
        return st;
    }
}
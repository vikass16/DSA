class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int ct = 0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                ct++;
            }else{
                j++;
            }
        }
        return ct==s.length()?true:false;
    }
}
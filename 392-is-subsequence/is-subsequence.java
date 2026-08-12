class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int j=0;
        int i=0;
        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                count++;
            }else{
                j++;
            }
        }
        if(count == s.length()){
            return true;
        }
        return false;
    }
}
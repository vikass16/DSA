class Solution {
    public boolean isPalindrome(String s) {
        
        int start = 0;

        int end = s.length()-1;
        while(start <= end){
            char ch = s.charAt(start);
            char ch1 = s.charAt(end);
            if(!Character.isLetterOrDigit(ch)){
                start++;
            }else if(!Character.isLetterOrDigit(ch1)){
                end--;
            }else {
                if(Character.toUpperCase(ch) != Character.toUpperCase(ch1)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start <= end){
            char chLeft = s.charAt(start);
            char chRight = s.charAt(end);

            if(!Character.isLetterOrDigit(chLeft)){
                start++;
            }else if(!Character.isLetterOrDigit(chRight)){
                end--;
            }else{
                if(Character.toUpperCase(chLeft) != Character.toUpperCase(chRight)){
                    return false;
                }else{
                    start++;
                    end--;
                }
            }
        }
        return true;
    }
}
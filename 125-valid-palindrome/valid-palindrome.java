class Solution {
    public boolean isPalindrome(String s) {
        

        int start =0;
        int end = s.length()-1;
        while(start <= end){
            char chStart = s.charAt(start);
            char chEnd = s.charAt(end);

            if(!Character.isLetterOrDigit(chStart)){
                start++;
            }else if(!Character.isLetterOrDigit(chEnd)){
                end--;
            }else{
                if(Character.toUpperCase(chStart) != Character.toUpperCase(chEnd)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int start = 0;
        int end = s.length()-1;

        while(start <= end){
            if(!isVowel(chars[start])){
                start++;
            }else if(!isVowel(chars[end])){
                end--;
            }else{
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return new String(chars);

    }

    public boolean isVowel(char ch){
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
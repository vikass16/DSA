
class Solution {
    public String smallestSubsequence(String s) {
        // Step 1: Find the last index of each character
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        // Stack to store the characters and boolean array to track visited ones
        StringBuilder stack = new StringBuilder();
        boolean[] visited = new boolean[26];
        
        // Step 3: Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int currIdx = curr - 'a';
            
            // Skip if the character is already in our result
            if (visited[currIdx]) continue;
            
            // Pop characters that are larger than curr and appear later
            while (stack.length() > 0 && 
                   stack.charAt(stack.length() - 1) > curr && 
                   lastIndex[stack.charAt(stack.length() - 1) - 'a'] > i) {
                
                char popped = stack.charAt(stack.length() - 1);
                stack.deleteCharAt(stack.length() - 1);
                visited[popped - 'a'] = false;
            }
            
            // Add current character to stack and mark as visited
            stack.append(curr);
            visited[currIdx] = true;
        }
        
        return stack.toString();
    }
}

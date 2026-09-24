class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int left = 0;
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int r =0; r < s.length(); r++){
            char ch = s.charAt(r);

            if(map.containsKey(ch) && map.get(ch)>=left){
                left = map.get(ch)+1;
            }

            map.put(ch, r);
            max = Math.max(max, r - left +1);
        }
        return max;
    }
}
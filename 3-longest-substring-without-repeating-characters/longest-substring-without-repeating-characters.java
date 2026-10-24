class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map= new HashMap<>();

        int max = Integer.MIN_VALUE;
        int left = 0;
        for(int right =0; right<s.length(); right++){
            char ch = s.charAt(right);

            if(map.containsKey(ch) && map.get(ch) >= left){
                left = map.get(ch)+1;
            }
            map.put(ch, right);
            max = Math.max(max, right-left+1);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
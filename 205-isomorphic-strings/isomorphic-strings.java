class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] freq1 = new int[128];
        int[] freq2 = new int[128];

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (freq1[c1] != freq2[c2]) {
                return false;
            }

            freq1[c1] = i + 1;
            freq2[c2] = i + 1;
        }

        return true;
    }
}
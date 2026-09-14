class Solution {
    public int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int maxP = 0;
        for(int n : prices){
            minP = Math.min(minP, n);
            maxP = Math.max(maxP, n-minP);
        }
        return maxP;
    }
}
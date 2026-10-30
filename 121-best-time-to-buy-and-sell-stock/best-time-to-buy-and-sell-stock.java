class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int n: prices){
            minPrice = Math.min(minPrice, n);
            maxPrice = Math.max(maxPrice, n - minPrice);
        }

        return maxPrice;
    }
}
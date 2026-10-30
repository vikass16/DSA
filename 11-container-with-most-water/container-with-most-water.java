class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;

        int max = Integer.MIN_VALUE;

        while(start <= end){
            int min = Math.min(height[start], height[end]);
            int len = end-start;
            int area = len * min;
            max = Math.max(area, max);
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}
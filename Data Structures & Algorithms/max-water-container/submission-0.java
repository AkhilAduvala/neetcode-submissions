class Solution {
    public int maxArea(int[] heights) {
        int water = Integer.MIN_VALUE;
        int mostWater = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length - 1;
        while(left < right){
            int minHeight = heights[left] > heights[right] ? heights[right] : heights[left];
            water = minHeight * (right - left);
            mostWater = Math.max(water, mostWater);
            if(heights[left] > heights[right]){
                right--;
            }else if (heights[left] < heights[right]){
                left++;
            }else{
                right--;
                left++;
            }
        }

        return mostWater;
        
    }
}

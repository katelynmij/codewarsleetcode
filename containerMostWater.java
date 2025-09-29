public class Solution {
    public Integer max_area(int[] heights) {
        int left = 0, right = heights.length - 1;
        int max = 0;

        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = height * width;

            //max = Math.max(max, area);
            if (area > max){
                max = area;
            } 

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}

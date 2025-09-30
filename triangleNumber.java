public class Solution {
    public Integer triangleNumber(int[] heights) {
        Arrays.sort(heights);
        int count = 0; 

        for (int i = heights.length - 1; i >= 2; i--) {
            int beginning = 0;
            int middle = i - 1;
            while (beginning < middle) {
                if (nums[beginning] + nums[middle] > nums[i]) {
                   count += (middle - beginning);
                   middle--;
                } else {
                    beginning++;
                }
            }
        }
        return count;
    }
}


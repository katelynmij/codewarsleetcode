class Solution {
    public int numIdenticalPairs(int[] nums) {
        // j greater than i
        // but values are the same
        int goodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}

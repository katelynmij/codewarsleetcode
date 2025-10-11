class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                return new int[]{nums[left + 1], nums[right + 1]};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}

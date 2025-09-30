class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}

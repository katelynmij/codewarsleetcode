class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] solution = [2];

        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                return new int[]{nums[left], nums[right]};
            }
            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}

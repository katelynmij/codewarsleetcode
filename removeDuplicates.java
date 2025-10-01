class Solution {
    public int removeDuplicates(int[] nums) {
        // base case
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        // set pointers
        int left = 0;
        int right = 0;
        while (right < n) {
            if (nums[left] != nums[right]) {
                // 0 1 1 2
                //^  ^
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left;
    }
}

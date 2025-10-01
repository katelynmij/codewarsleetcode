class Solution {
    public int removeTwoDuplicates(int[] nums) {
        // base case
        int n = nums.length;
        if (n < 3) {
            return n;
        }

        // define pointers and counter
        int left = 0;
        int right = 1;
        count = 0;
        // remove duplicates
        while (right < n) {
            if(nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
                count = 0;
            } else if (nums[left] == nums[right] && count < 1) {
                count++;
                nums[++left] = nums[right];
            }
            right++;
        }
        return left + 1;
        // return length
    }
}

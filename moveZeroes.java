public class Solution {
    public int[] moveZeroes(int[] nums) {
        // base case
        int n = nums.length();
        if (n < 2) {
            return new int[] {0};
        }
        // pointers
        int left = 0;
        int right = 1;
        // moving zeroes
        while (right < n) {
            if (nums[left] != 0) { // if left pointer is not zero, 
                left++; // left keeps going and
                right++; // right keeps going
            } else if (nums[right] == 0) { // if right pointer is zero, we've found a zero
                right++; // keep moving so left pointer gets detected as zero
            } else { // left pointer found as zero
                int tempHolder = nums[right]; // temporarily hold right value
                nums[right] = nums[left]; // right is now left, the zero
                nums[left] = tempHolder; // left is right, the non zero number
            }
        }
        return nums;
    }
}

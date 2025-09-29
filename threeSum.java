class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = n - 1;
            int requiredSum = 0 - nums[i];

            while (l < r) {
                if (nums[l] + nums[r] == requiredSum) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // duplicate skipping
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                    
                }
                else if (nums[l] + nums[r] < requiredSum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}

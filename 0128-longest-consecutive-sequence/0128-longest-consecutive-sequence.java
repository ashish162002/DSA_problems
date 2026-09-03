class Solution {
    public int longestConsecutive(int[] nums) {
        int x;
        int y;
        int max1 = 0, count = 0;

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            x = nums[i];
            y = nums[i - 1] + 1;

            if (x == y) {
                count++;
                max1 = Math.max(max1, count);
            }
            else if (x != nums[i - 1]) {
                count = 0;
            }
        }

        return max1 + 1;
    }
}
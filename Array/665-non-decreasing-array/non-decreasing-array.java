class Solution {
    //Non-Decreasing Array
    public boolean checkPossibility(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (count > 1) return false;

                if (i == 1 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];   // fix left
                } else {
                    nums[i] = nums[i - 1];   // fix right
                }
            }
        }
        return true;
    }
}
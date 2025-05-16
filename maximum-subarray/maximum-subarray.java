class Solution {
    public int maxSubArray(int[] nums) {
        int current = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            current = Integer.max(nums[i], current+nums[i]);
            maxSum = Integer.max(maxSum, current);
        }
        return maxSum;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        //1. square the num
        //2. Sort ---> O(nlogn) + O(n)
        for(int i=0; i<nums.length; i++) {
            nums[i] = nums[i] * nums[i]; 
        }

        Arrays.sort(nums);
        return nums;
    }
}
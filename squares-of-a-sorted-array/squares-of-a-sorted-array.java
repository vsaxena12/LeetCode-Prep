class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int idx = nums.length-1; 

        while(left<=right) {
            if(nums[left] > nums[right]) {
                result[idx--] = nums[left++];
            } else {
                result[idx--] = nums[right--];
            }
        }

        return result;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int position = 0;

        for(int n: nums) {
            if(n != 0) {
                nums[position++] = n;
            }
        } //--------- TC O(N)

        while(position < nums.length) {
            nums[position++] = 0;
        } //--------- TC O(N)
    }
}
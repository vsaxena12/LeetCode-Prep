# Two Sum

https://leetcode.com/problems/two-sum/description/

Main solution is given 
1. Using HashMap
2. Using Sorting
   

        /**
          Cannot use extra space
          Can you come up with an algorithm that is less than O(n2) time complexity?
          Can only work if we are returning numbers and not indexes
         */
        class Solution {
            public int[] twoSum(int[] nums, int target) {
                Arrays.sort(nums);
                
                //Using two pointer approach        
                int left = 0;
                int right = nums.length-1;
        
                while(left<right) {
                    if(nums[left] + nums[right] == target) {
                        return new int[]{left, right};
                    } else if(nums[left] + nums[right] > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
                return null;
            }
        }
   
4. Using Brute force


         class Solution {
            public int[] twoSum(int[] nums, int target) {
        
                for (int i = 0; i < nums.length - 1; i++) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] + nums[j] == target) {
                            return new int[] { i, j };
                        }
                    }
                }
                return new int[] { -1, -1 };
            }
        }

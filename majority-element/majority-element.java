class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        int counter = 0;

        for(int n: nums) {
            if(counter == 0){
                counter++;
                majorityElement = n;
            } else if(majorityElement == n) {
                counter++;
            } else {
                counter--;
            }
        }
        return majorityElement;
    }
}
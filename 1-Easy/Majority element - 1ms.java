
// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        int counter = 1;
        int majority = nums[0];
        for(int i=1;i<nums.length;++i){
            if(counter==0){
                majority = nums[i];
                ++counter;
            }
            else if(nums[i] == majority) ++counter;
            else --counter;
        }
        return majority;
    }
}
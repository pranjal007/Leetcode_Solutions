
// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
         
        int i=0;int j=0;
        int temp=0;
        while(i<nums.length){
            if(nums[i]!=0){
                temp=nums[j];
                nums[j]= nums[i];
                nums[i]=temp;
                j++;
            }  
            i++;
        }
    }
}
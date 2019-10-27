
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j=0,i=0;
        if(nums.length==0) return 0;
        while(i<nums.length){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
            i++;
        }
        return j+1;
    }
}

// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxsum = Integer.MIN_VALUE;
        int sumtillnow = 0;
        
        for(int i=0;i<nums.length;i++){
            sumtillnow +=nums[i];
            if(maxsum<sumtillnow) maxsum = sumtillnow;
            if(sumtillnow<0) sumtillnow=0;
        }
        return maxsum;
    }
}
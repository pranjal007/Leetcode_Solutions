
// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        
        int len = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int sumtillnow = 0;
        
        for(int i=0;i<len;i++){
            sumtillnow = sumtillnow+nums[i];
            maxsum = maxsum<sumtillnow?sumtillnow:maxsum;
            sumtillnow = sumtillnow<0?0:sumtillnow;
        }
        return maxsum;
    }
}
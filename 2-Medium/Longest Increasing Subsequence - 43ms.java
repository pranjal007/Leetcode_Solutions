
// https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int len = nums.length;
        if(len==0) return 0;
        int[] subs = new int[len];
        for(int i=0;i<len;i++){
            subs[i]=1;
        }
        
        int max=subs[0];
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    subs[i]= Math.max(subs[i],subs[j]+1);
                    if(subs[i]>max) max=subs[i];
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(subs[i]+", ");
        }
        return max;
    }
}
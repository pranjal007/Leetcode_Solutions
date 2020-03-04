
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[nums.length+1];
        
        for(int i=0;i<nums.length;++i){
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;++i){
            if(arr[i]==2) list.add(i);
        }
        
        return list;
    }
}
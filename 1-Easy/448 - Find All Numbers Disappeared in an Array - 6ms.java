
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int j=0;
        int[] arr = new int[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1] = -1; 
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]==0){
                list.add(i+1);
            }
        }
        
        return list;
        
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean flag=false;
        int[] a = new int[2];
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
             int complement = target - nums[i];
             if (map.containsKey(complement) && map.get(complement) != i) {
                flag=true;
                a[0]=i;
                a[1]=map.get(complement);
                break;
            }
        }
        
        return a;
        
    }
}
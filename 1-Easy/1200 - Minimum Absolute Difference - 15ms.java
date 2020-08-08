
// https://leetcode.com/problems/minimum-absolute-difference/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1]) <min){
                min = Math.abs(arr[i]-arr[i+1]);
            }
        }
        
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        
        return list;
        
        
        
        
        
    }
}
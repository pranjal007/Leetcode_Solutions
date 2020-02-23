
// https://leetcode.com/problems/unique-number-of-occurrences/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
            else map.put(arr[i], 1);
            
        }
        HashSet<Integer> set= new HashSet<Integer>();
        boolean flag=false;
        for(Integer x : map.keySet()){
            if(set.add(map.get(x))) flag=true;
            else{
                flag=false;
                break;
            } 
        }
        return flag;
    }
}
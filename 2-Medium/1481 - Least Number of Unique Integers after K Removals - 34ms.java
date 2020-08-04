
// https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        if(k==arr.length) return 0;
        
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int i=0,count=1;
        while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                list.add(count);
                count=1;
            } 
            i++;
        }
        
        list.add(count);
        Collections.sort(list);
        
        for(i=0;i<list.size();i++){
            k-=list.get(i);
            if(k<=0){
                count = k==0?list.size()-i-1:list.size()-i;
                break;
            }
        }
        
        return count;

    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max =0,currstart =0,previndex=0;
        char prev=' ';
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                int index = map.get(curr);
                if(index>=currstart && index<=i){
                    currstart=index+1;
                }
                map.put(curr,i);
            }
            else{
                prev=curr;
                previndex = i;
                map.put(curr,i);
            }
            max = max<=i-currstart?max=i-currstart+1:max;
            
            //System.out.println(max);
        }
        return max;
    }
}
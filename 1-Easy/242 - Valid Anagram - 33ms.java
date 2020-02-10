
// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        
        
        for(int i=0;i<s.length();i++){
            Integer x = Integer.valueOf(s.charAt(i));
            if(map1.containsKey(x)){
                map1.put(x, map1.get(x)+1);
            }else{
                map1.put(x,1);
            }
        }
        for(int i=0;i<s.length();i++){
            Integer x = Integer.valueOf(s.charAt(i));
            if(map2.containsKey(x)){
                map2.put(x, map2.get(x)+1);
            }else{
                map2.put(x,1);
            }
        }
        
        return map1.equals(map2);
    }
}
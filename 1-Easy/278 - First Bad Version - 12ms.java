
// https://leetcode.com/problems/first-bad-version/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start =0;
        int end = n;
        int mid = (int)((start/2.0)+(end/2.0));
        while(mid>start){
            if(isBadVersion(mid)==true){
                end = mid;
            }else{
                start = mid;
            }
            mid = (int)((start/2.0)+(end/2.0));
        }
        return mid+1;
    }

}
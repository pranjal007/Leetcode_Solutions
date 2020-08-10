
// https://leetcode.com/problems/check-if-it-is-a-straight-line/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        double slope  = (double)(coordinates[0][1] - coordinates[1][1]) / (double)(coordinates[0][0] - coordinates[1][0]);
        
        for(int i =2;i<coordinates.length;i++){
            if( (double)(coordinates[0][1] - coordinates[i][1]) / (double)(coordinates[0][0] - coordinates[i][0]) !=slope) {
                if(Double.isInfinite(slope)){
                    if(Math.abs(slope) != Math.abs((double)(coordinates[0][1] - coordinates[i][1]) / (double)(coordinates[0][0] - coordinates[i][0]))) return false;
                }else return false;
            }
                
        }
        return true;
    }
}
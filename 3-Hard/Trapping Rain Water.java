class Solution {
    public int trap(int[] height) {
        
        if(height.length<3){
            return 0;
        }
        
        int[] maxright = new int[height.length];
        int length = height.length;
        maxright[length-1]=height[length-1];
            
        for(int i=length-2;i>=0;i--){
            if(height[i]>maxright[i+1]){
                maxright[i]=height[i];
            }
            else{
                maxright[i]=maxright[i+1];
            }
        }
        //System.out.println(Arrays.toString(maxright));
        int totalrainwater = 0;
        int maxleft=height[0];
        
        for(int i=1;i<length;i++){
            if(height[i]<maxleft && height[i]<maxright[i]){
                totalrainwater += Math.min(maxleft,maxright[i])-height[i];
            }
            else if(height[i]>maxleft){
                maxleft=height[i];
            }
        }
        return totalrainwater;
    }
}
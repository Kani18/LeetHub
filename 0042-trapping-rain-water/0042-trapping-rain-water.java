class Solution {
    public int trap(int[] height) {
       int n=height.length;
        int l=0,r=n-1;
        int lmax=0,rmax=0;
        
        int watertrapped=0;
        
        while(l<=r){
            
            
            if(height[l]<height[r]){
                if(height[l]>lmax)
                    lmax=height[l];
                else
                    watertrapped+=lmax-height[l];
            l++;    
            }
            
            else{
                if(height[r]>rmax)
                    rmax=height[r];
                else
                    watertrapped+=rmax-height[r];
            r--;
            }
        }
        
        return watertrapped;        
        
    }
}
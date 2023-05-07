class Solution {
    public int maxArea(int[] height) {
        
   /*     
        //area=l*b
        int maxi=0;
        int watertrapped=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                watertrapped=Math.min(height[i],height[j])* (j-i);
                maxi=Math.max(maxi,watertrapped);
            }
    
        }
        return maxi;*/
        
        int n=height.length;
        int l=0,r=n-1;
        int area=0;
        
        while(l<=r){
            int watertrapped=Math.min(height[l],height[r])* (r-l);
            area=Math.max(area,watertrapped);
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return area;
    }
}
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        /* int max=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
            ans=i;
            }
        }
        return ans;
    }
}*/
        
int l=0;
int h=arr.length;
        
while(l<h){
    int m=l+(h-l)/2;
    if(arr[m]>arr[m+1])
         h=m;
    else
        l=m+1;
}
        return l;
    }
}
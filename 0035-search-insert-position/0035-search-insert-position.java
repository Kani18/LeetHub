class Solution {
    public int searchInsert(int[] Arr, int k) {
         int n=Arr.length;
        
        int l=0;
        int h=n-1;
        int ans=0;
        
        while(l<=h){
            int mid=l+(h-l)/2;
            if(Arr[mid]==k)
                return mid;
            else if(Arr[mid]<k)
                 l=mid+1;
            else
                h=mid-1;
        }
        return l;
                 
    }
}
        

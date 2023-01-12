class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int start=0;
        int size=0;
       // int flag=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                 sum-=nums[start++];
           // if(sum==target){
                //flag=1;
                size=i-start+1;
                if(size<min)
                  min=size;
            }
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        return min+1;
    }
    }

class Solution {
    public int maxSubArray(int[] nums) {
     /*   int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum>max)
                   max=sum;
               
            }
        }
       return max; 
    }

}*/
        
          int max=Integer.MIN_VALUE;;
    int cursum=0;
        
    int n=nums.length;
        
    for(int i=0;i<n;i++){
        cursum+=nums[i];
        if(cursum>max)
             max=cursum;
        if(cursum<0)
            cursum=0;
    }
        
        return max;
    }
}
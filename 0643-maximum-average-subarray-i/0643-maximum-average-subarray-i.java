class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        
      
      /*  double maxavg=Integer.MIN_VALUE;
        int n=nums.length;
        
        if(n==1)
            return nums[0];
        
        for(int i=0;i<=n-k;i++){
            double sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
                double avg=sum/k;
                maxavg=Math.max(maxavg,avg);
            
        }
        return maxavg;*/
        
        
           double avg=0;
        double maxavg=Integer.MIN_VALUE;
        int ws=0;
        
        double sum=0;
        
       // if(nums.length==1)
           // return nums[0];
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            if(i>=k-1){
                avg=sum/k;
                maxavg=Math.max(maxavg,avg);
                sum-=nums[ws++];
            }
        }
        return maxavg;
        
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        
        /* NEW ARRAY TC:O(n) SC:O(n)
        int n=nums.length;
        int[] na=new int[n+1];
              for(int j=0;j<nums.length;j++){
                na[nums[j]]=1;
            }
       
        for(int i=0;i<na.length;i++){
            if(na[i]==0)
                return i;
        }
        return n;*/
        
        
             
        int i=0;
   while(i<nums.length){
       int currpos=nums[i];
       if(nums[i]<nums.length && nums[i] !=nums[currpos]){
          int temp=nums[i];
          nums[i]=nums[currpos];
          nums[currpos]=temp;
       }
       else{
           i++;
       }
   }
   
   
   for( i=0;i<nums.length;i++){
       if(nums[i]!=i)
         return i;
   }


return nums.length;
}
}
       
    
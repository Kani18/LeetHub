class Solution {
    public int removeElement(int[] nums, int val) {
       
    /* int k=0;
     int c=0;
     int[] ans=new int[nums.length];
       for(int i=0;i<nums.length;i++){
           if(nums[i]==val)
               continue;
           else{
               ans[k++]=nums[i];
               c+=1;
           }
               
       } 
      System.out.println(Arrays.toString(ans));
       System.out.println(c);
    }
}*/
        int k=0;
     int c=0;
    // int[] ans=new int[nums.length];
       for(int i=0;i<nums.length;i++){
           if(nums[i]==val)
               continue;
           else{
               nums[k++]=nums[i];
               c+=1;
           }
       }
           return k;    
       } 
    }
        

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        //TC:O(n^2) SC:O(n)
        
       /* int[] ans=new int[2];
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
                    
            }
        }
        return ans;
    }
}*/

    
        
        /*int[] ans=new int[2];
        
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(diff==nums[j]){
                    ans[0]=i;
                    ans[1]=j;
                }
                    
            }
        }
        return ans;
    }
}*/
        
        
        
        
        
        int[] ans=new int[2]; 
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
          int diff=target-nums[i];
          if(!mp.containsKey(diff))
              mp.put(nums[i],i);
          else{
              ans[0]=mp.get(diff);
              ans[1]=i;
         //   return ans;
        }
        }
        return ans;
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
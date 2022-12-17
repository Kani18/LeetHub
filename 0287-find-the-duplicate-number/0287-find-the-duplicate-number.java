class Solution {
    public int findDuplicate(int[] nums) {
      /*    int ans=0;
        
        for(int i=0;i<nums.length;i++){
            int c=1;
            for(int j=0;j<nums.length;j++){
                if(i != j){
                    if(nums[i] ==nums[j])
                        c+=1;
                }
            }
            if(c!=1){
              ans=nums[i];
            }
        }
        return ans;
    }
}*/
    
        
        /*
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
        }
}*/
        
        
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(!map.containsKey(i))
                map.put(i,1);
            else
                return i;
        }
        return -1;
    }
}
        
        
        
        
        
        
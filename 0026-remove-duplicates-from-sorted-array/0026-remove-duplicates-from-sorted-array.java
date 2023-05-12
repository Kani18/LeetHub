class Solution {
    public int removeDuplicates(int[] nums) {
       /* Set<Integer> arr=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            arr.add(nums[i]);
        List<Integer> list = new ArrayList<Integer>(arr);
        Collections.sort(list);
        for(int i=0;i<arr.size();i++)
            nums[i]=list.get(i);
        return arr.size();
        
    }
}*/
      /*  int N=nums.length;
        int k=1;
        for(int i=1;i<N;i++){
            if(nums[i] != nums[i-1]){
                nums[k++]=nums[i];
            }
        }
        return k;*/
        
        int n=nums.length;
        int j=0;
        
        for(int i=0;i<n-1;i++){
            if(nums[i] !=nums[i+1])
                nums[j++]=nums[i];
        }
        nums[j++]=nums[n-1];
        return j;
    }
}
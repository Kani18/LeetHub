class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        
        List<Integer> ans=new ArrayList<Integer>();
        
        int i=0;
        while(i<nums.length){
            int currpos=nums[i]-1;
            if(nums[i] !=nums[currpos]){
                int temp=nums[i];
                nums[i]=nums[currpos];
                nums[currpos]=temp;
            }
            else
                i++;
        }
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
                ans.add(j+1);
        }
        
        return ans;
    }
}
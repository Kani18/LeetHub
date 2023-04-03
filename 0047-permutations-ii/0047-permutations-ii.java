class Solution {
    
       void permute(int[] nums, List<Integer> ds, int[] freq,List<List<Integer>> ans ){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
            
        }
        
        for(int i=0;i<nums.length;i++){
            if(freq[i]==0){
                freq[i]=1;
                ds.add(nums[i]);
                permute(nums,ds,freq,ans);
                ds.remove(ds.size()-1);
                freq[i]=0;
               while(i+1<nums.length && nums[i] == nums[i+1]) i++;
                
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        int[] freq=new int[nums.length];
        Arrays.sort(nums);
        permute(nums,ds,freq,ans);
        return ans;
    }
}
    
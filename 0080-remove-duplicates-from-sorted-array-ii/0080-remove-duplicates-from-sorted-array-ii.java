class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=0;
        int c=0;
        for(int i=0;i<n-1;i++){
            if(nums[i] !=nums[i+1]){
                nums[j++]=nums[i];
                c=0;
            }
            if(nums[i]==nums[i+1] && c<1)
            {
                nums[j++]=nums[i];
                c+=1;
            }
        }
        nums[j++]=nums[n-1];
        return j;
    }
}
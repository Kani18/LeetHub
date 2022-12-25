class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> arr=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            arr.add(nums[i]);
        List<Integer> list = new ArrayList<Integer>(arr);
        Collections.sort(list);
        for(int i=0;i<arr.size();i++)
            nums[i]=list.get(i);
        return arr.size();
        
    }
}
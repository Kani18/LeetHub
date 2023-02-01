class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        n=len(nums)
        if(n==1):
            return 0
        nums.sort()
        maxi=0
        for i in range(n-1,0,-1):
            maxi=max(maxi,nums[i]-nums[i-1])
        return maxi
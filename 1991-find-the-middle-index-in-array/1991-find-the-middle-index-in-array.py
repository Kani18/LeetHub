class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        n=len(nums)
        for i in range(n):
            fs=0
            for j in range(0,i):
                fs+=nums[j]
            print(fs)
            bs=0
            for k in range(i+1,n):
                bs+=nums[k]
            print(bs)
            if(fs==bs):
                return i
        return -1
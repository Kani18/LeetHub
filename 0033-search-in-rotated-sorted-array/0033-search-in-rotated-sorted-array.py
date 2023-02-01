def binarysearch(nums,target,l,h):
    while(l<=h):
        mid=l+(h-l)//2
        if(target > nums[mid]):
            l=mid+1
        elif(target < nums[mid]):
            h=mid-1
        else:
            return mid
    return -1

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
         n=len(nums)
         if(n==1 and nums[0]!=target):
                return -1
       #  if(n==1 and nums[0]==target):
             #  return 0
         pivot=0
         for i in range(len(nums)-1):
            if(nums[i+1]<nums[i]):
                pivot=i
                
         firsthalf=binarysearch(nums,target,0,pivot)
         if(firsthalf!=-1):
                return firsthalf
         return binarysearch(nums,target,pivot+1,n-1)
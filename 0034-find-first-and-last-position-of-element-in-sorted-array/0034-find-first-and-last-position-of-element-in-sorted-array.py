def binarysearchh(arr,x,frontindex):
        n=len(arr)
        ans=-1
        l=0
        h=n-1
        while(l<=h):
            mid=l+(h-l)//2
            if(x>arr[mid]):
                l=mid+1
            elif(x<arr[mid]):
                 h=mid-1
            else:
                ans=mid
                if(frontindex==True):
                    h=mid-1
                else:
                    l=mid+1
                
        return ans

class Solution:
    def searchRange(self, arr: List[int], x: int) -> List[int]:
              ans=[1]*2
              start=binarysearchh(arr,x,True)
              end=binarysearchh(arr,x,False)
              ans[0]=start
              ans[1]=end
    
              return ans
  
   
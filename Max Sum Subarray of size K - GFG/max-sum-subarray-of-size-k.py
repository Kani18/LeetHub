#User function Template for python3
class Solution:
    def maximumSumSubarray (self,K,Arr,N):
        cursum=0
        ws=0
        maxi=0
         
        for i in range(N):
            cursum+=Arr[i]
            
            if(i>=K-1):
                maxi=max(maxi,cursum)
                cursum-=Arr[ws]
                ws+=1
            
            
        
        return maxi
        

#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        
        N,K = input().split()
        N = int(N)
        K = int(K)
        Arr = list( map(int,input().strip().split(" ")))

        ob = Solution()
        print(ob.maximumSumSubarray(K,Arr,N))
# } Driver Code Ends
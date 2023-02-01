#User function Template for python3
def binarysearch(arr,x,frontindex):
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

def find(arr,n,x):
    # code here
    ans=[1]*2
    start=binarysearch(arr,x,True)
    end=binarysearch(arr,x,False)
    
    if(start==-1 and end==-1):
        ans[0]=-1
        ans[1]=-1
    else:
        ans[0]=start
        ans[1]=end
    
    return ans
    
 

#{ 
 # Driver Code Starts
t=int(input())
for _ in range(0,t):
    l=list(map(int,input().split()))
    n=l[0]
    x=l[1]
    arr=list(map(int,input().split()))
    ans=find(arr,n,x)
    print(*ans)
# } Driver Code Ends
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
      
      
      int n=A.length;
      long[] ans=new long[N-K+1];
      int ind=0;
      int start=0;
      long num=0;
      
      Queue<Long> q=new LinkedList<Long>();
      
      for(int i=0;i<N;i++){
            if(A[i] < 0)
               q.add(A[i]);
             
            if(i>=K-1){
                if(q.isEmpty()){
                    ans[ind++]=0;
                    //ind+=1;
                }
                else{ 
                      num=q.peek();
                      ans[ind++]=num;
                      //ind+=1;
                
                      if(num==A[start]){
                         q.remove();
                      }
                        
                }  
                    start+=1;
                
                
            } 
          
      }
      return ans;
      
    }
}
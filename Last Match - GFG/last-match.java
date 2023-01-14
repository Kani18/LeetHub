//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    
     static void computelps(String pat,int[] lps){
        int len=0;
        int i=1;
        lps[0]=0;
        int l=pat.length();
        
        while(i<l){
            if(pat.charAt(len)==pat.charAt(i)){
                lps[i]=len+1;
                len++;
                i++;
            }
            else{
                if(len==0){
                  lps[i]=0;
                  i++;
                }
                else
                  len=lps[len-1];
                 
            }
            
        }
    }

    static int findLastOccurence(String txt,String pat){
        // code here
        int ans=-1;
        int max=-1;
        
        int m=pat.length();
        int n=txt.length();
        
        int[] lps=new int[m];
        
       
        int i=0;
        int j=0;
        
        computelps(pat,lps);
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j==0)
                i++;
                else
                  j=lps[j-1];
            }
            
            if(j==m){
                ans=i-j+1;
               j=lps[j-1];
               max=Math.max(max,ans);
                
            }
        }
       return max; 
    } 
}
    

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String A = read.readLine().trim();
             String B = read.readLine().trim();
          

            Solution ob = new Solution();
            System.out.println(ob.findLastOccurence(A,B));
        }
    }
}
// } Driver Code Ends
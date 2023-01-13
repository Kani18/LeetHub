//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            if(res.size()==0)
                System.out.print(-1);
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void  Computelps(String pat,int[] lps){
            lps[0]=0;
            int start=0;
            int slide=1;
            int pl=pat.length();
            while(slide<pl){
                if(pat.charAt(start)==pat.charAt(slide))
                {
                    lps[slide]=start+1;
                    start+=1;
                    slide+=1;
                }
                else{
                    if(start==0){
                      lps[slide]=0;
                      slide+=1;
                    }
                    else
                    {
                        start=lps[start-1];
                    }
                }
            }
        }
        
    ArrayList<Integer> search(String pat, String txt)
    {
        // your code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        int n=txt.length();
        int ps=0;
        int ts=0;
        int[] lps=new int[pat.length()]; 
        Computelps(pat,lps);
         while(ts<n){
            if(pat.charAt(ps)==txt.charAt(ts)){
                ps+=1;
                ts+=1;
            }
           
            else{
                if(ps==0)
                   ts+=1;
                else
                  ps=lps[ps-1];
            }
           if(ps==pat.length()){
               ans.add((ts-ps)+1);
              // System.out.print(ans);
               ps=lps[ps-1];
            }
        }  
      
        
        return ans;
    }
}
//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
          HashSet<Character> set=new HashSet<>();
        int n=S.length();
        int l=0;
        int r=0;
        int max=0;
        while(l<n && r<n){
            char ch=S.charAt(r);
            if(set.contains(ch)){
                set.remove(S.charAt(l));
                l+=1;
            }
            else{
                set.add(ch);
                max=Math.max(max,r-l+1);
                r+=1;
            }
        }
        return max;
    }
}
  
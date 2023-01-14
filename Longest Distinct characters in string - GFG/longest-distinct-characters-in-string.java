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
    static int longestSubstrDistinctChars(String s){
        // code here
    /*      HashSet<Character> set=new HashSet<>();
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
}*/


   HashMap<Character,Integer> mpp=new HashMap<>();
        int n=s.length();
        if(n==0)
             return 0;
        
        int windowstart=0;
        int maxlen=0;
        
        for(int windowend=0;windowend<n;windowend++){
            char ch=s.charAt(windowend);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            
            
            while(mpp.get(ch)>1){
                char start=s.charAt(windowstart++);
                mpp.put(start,mpp.get(start)-1);
            }
            maxlen=Math.max(maxlen,windowend-windowstart+1);
            
        }
        return maxlen;
    }
}
  
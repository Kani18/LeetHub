//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
               HashMap<Character,Integer> mpp=new HashMap<>();
        int n=s.length();
        int windowstart=0;
        int maxlen=-1;
        
        for(int windowend=0;windowend<n;windowend++){
            char ch=s.charAt(windowend);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            
            while(mpp.size()>k){
                char startchar=s.charAt(windowstart++);
                mpp.put(startchar,mpp.get(startchar)-1);
                
                if(mpp.get(startchar)==0){
                    mpp.remove(startchar);
                }
            }
            if(mpp.size()==k){
                maxlen=Math.max(maxlen,windowend-windowstart+1);
            }
            
        }
        return maxlen;
    }
}
    
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] fruits = new int[N];
            for (int i = 0; i < N; i++) fruits[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.totalFruits(N, fruits);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int totalFruits(int N, int[] fruits) {
 HashMap<Integer,Integer> mpp=new HashMap<>();
        
        
        int ws=0;
        int maxlen=0;
        int n=fruits.length;
        
        if(n==1 || n==2)
            return n;
        
        for(int i=0;i<n;i++){
            if(!mpp.containsKey(fruits[i]))
                mpp.put(fruits[i],1);
            else
                mpp.put(fruits[i],mpp.get(fruits[i])+1);
            
            while(mpp.size() > 2){
                int start=fruits[ws++];
                mpp.put(start,mpp.get(start)-1);
                if(mpp.get(start)==0)
                    mpp.remove(start);
               
            }
            
            if(mpp.size()<=2)
                maxlen=Math.max(maxlen,i-ws+1);
        }
        return maxlen;
    }
}
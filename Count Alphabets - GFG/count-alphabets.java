//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String S = read.readLine();
            

            Solution ob = new Solution();
            

            
            System.out.println(ob.Count(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int Count(String S)
    {
     int c=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
               c+=1;
        }
        return c;
    }
}
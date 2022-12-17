//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
         HashMap<Character,Integer> mp=new HashMap<>();
char[] arr=S.toCharArray();
int n=arr.length;
//char ans='-1';
for(int i=0;i<n;i++){
    if(mp.containsKey(arr[i]))
       mp.put(arr[i],mp.get(arr[i])+1);
    else
       mp.put(arr[i],1);
}       
       
for(int i=0;i<n;i++){
    if(mp.get(arr[i])==1)
        return arr[i];
}
   
   
   return '$'; 
}
}

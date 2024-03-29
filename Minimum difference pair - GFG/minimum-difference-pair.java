//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.minimum_difference(nums);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int minimum_difference(int[] nums)
    {
        // code here
      /*  int n=nums.length;
        int diff=0;
        int min=9999;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                diff=Math.abs(nums[i]-nums[j]);
                if(diff<min)
                   min=diff;
            }
        }
        return min;*/
        
        Arrays.sort(nums);
        int n=nums.length;
        int diff=0;
        int min=99999;
        for(int i=1;i<n;i++){
            diff=Math.abs(nums[i]-nums[i-1]);
            min=Math.min(diff,min);
        }
        return min;
    }
}
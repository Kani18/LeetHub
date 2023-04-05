//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0; i<n; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> res = ob.uniquePerms(arr,n);
            for(int i=0; i<res.size(); i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    
      static void permute(ArrayList<Integer> nums, ArrayList<Integer> ds, int[] freq,ArrayList<ArrayList<Integer>> ans ){
        if(ds.size()==nums.size()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<nums.size();i++){
            if(freq[i]==0){
                freq[i]=1;
                ds.add(nums.get(i));
                permute(nums,ds,freq,ans);
                ds.remove(ds.size()-1);
                freq[i]=0;
                while(i+1<nums.size() && nums.get(i)==nums.get(i+1)) i++;
                
            }
        }
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> nums , int n) {
        // code here
         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        int[] freq=new int[nums.size()];
        Collections.sort(nums);
        permute(nums,ds,freq,ans);
        return ans;
    }
}
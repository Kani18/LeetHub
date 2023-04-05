//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    void permute(char[] nums, List<Character> ds, int[] freq,List<String> ans){
        if(ds.size()==nums.length){
            String s="";
            for(int i=0;i<ds.size();i++){
                s+=ds.get(i);
            }
          if(!ans.contains(s)){
            ans.add(s);
            return;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(freq[i]==0){
                freq[i]=1;
                ds.add(nums[i]);
                permute(nums,ds,freq,ans);
                ds.remove(ds.size()-1);
                freq[i]=0;
                
                
            }
        }
    }
    public ArrayList<String> permutation(String S)
    {
        //Your code here
          ArrayList<Character> ds=new ArrayList<>();
       ArrayList<String> ans=new ArrayList<>();
        char[] ch=S.toCharArray();
        int freq[]=new int[ch.length];
        
        permute(ch,ds,freq,ans);
        Collections.sort(ans);
        return ans;
    }
	   
}
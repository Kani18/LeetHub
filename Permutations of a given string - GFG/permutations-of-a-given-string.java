//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends



class Solution {
    
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
    
    
    public List<String> find_permutation(String S) {
        // Code here
        List<Character> ds=new ArrayList<>();
       List<String> ans=new ArrayList<>();
        char[] ch=S.toCharArray();
        int freq[]=new int[ch.length];
        
        permute(ch,ds,freq,ans);
        Collections.sort(ans);
        return ans;
    }
}
//{ Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    
     public void  Computelps(String pat,int[] lps){
            lps[0]=0;
            int start=0;
            int slide=1;
            int pl=pat.length();
            while(slide<pl){
                if(pat.charAt(start)==pat.charAt(slide))
                {
                    lps[slide]=start+1;
                    start+=1;
                    slide+=1;
                }
                else{
                    if(start==0){
                      lps[slide]=0;
                      slide+=1;
                    }
                    else
                    {
                        start=lps[start-1];
                    }
                }
            }
        }
    int strstr(String txt, String pat)
    {
       // Your code here
       int ans=-1;
        int n=txt.length();
        int ps=0;
        int ts=0;
        int[] lps=new int[pat.length()]; 
        Computelps(pat,lps);
         while(ts<n){
            if(pat.charAt(ps)==txt.charAt(ts)){
                ps+=1;
                ts+=1;
            }
           
            else{
                if(ps==0)
                   ts+=1;
                else
                  ps=lps[ps-1];
            }
           if(ps==pat.length()){
               ans=(ts-ps);
              // System.out.print(ans);
               ps=lps[ps-1];
               break;
            }
        }  
      
        
        return ans;
       
    }
}

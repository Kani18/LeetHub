//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          
          int n=str.length();
          String st="";
          for(int i=0;i<n;i++){
              char ch=str.charAt(i);
              int c=1;
              
              while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
                  c+=1;
                  i++;
              }
              
              st+=str.charAt(i)+""+c;
          }
          return st;
	}
	
 }
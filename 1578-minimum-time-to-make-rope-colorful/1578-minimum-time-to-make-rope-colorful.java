class Solution {
    public int minCost(String str, int[] neededTime) {
      /*  int n=str.length();
          int tc=0;
          int res=0;
          
        
        int l=0,r=0;
        while(l<n && r<n){
              char ch=str.charAt(l);
              tc=0;
              int maxi=0;
              
              while(r<n && ch==str.charAt(r)){
              tc+=neededTime[r];
              maxi=Math.max(maxi,neededTime[r]);
              r+=1;
        
              }
              
              res+=tc-maxi; 
            l=r;
                  
          }
          return res;
    }
}*/
        
        int n=str.length();
          int tc=0;
          String st="";
          int res=0;
       
          
          for(int i=0;i<n;i++){
            int maxi=0;
              char ch=str.charAt(i);
               tc=neededTime[i];
               maxi=Math.max(maxi,neededTime[i]);
            
              while(i<n-1 && ch==str.charAt(i+1)){
             tc+=neededTime[i+1];
              maxi=Math.max(maxi,neededTime[i+1]);
              i+=1;
              }
                res+=tc-maxi;
          }
        return res;
    }
}
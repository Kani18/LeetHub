class Solution {
    public int reverse(int x) {
          long result=0;
        int s=Math.abs(x);
        int n=Math.abs(x);
        while(n>0){
            int rem=n%10;
            result=result*10 +rem;
            n=n/10;
        }
        
        if(x!=s)
          result=-result;
           
        if (result> 2147483647 || result < -2147483647)
            result= 0;
     
    
    return (int)result;
        
 
    
        
    
    
    }
}
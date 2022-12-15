class Solution {
    public boolean rotateString(String str1, String str2) {
                int n=str1.length();
        char[] carr=str1.toCharArray();
        int n1=n;
        boolean ans=false;
        while(n1>0){
          char last=carr[0];
          for(int i=0;i<carr.length-1;i++){
              carr[i]=carr[i+1];
          }
          carr[carr.length-1]=last;
          n1-=1;
          String str = new String(carr);
         
            if((str.equals(str2))==true)
               ans=true;
          
           //System.out.println(str);
    }
         return ans;  
    }
}
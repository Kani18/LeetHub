class Solution {
    public void merge(int[] l, int ln, int[] r, int rm) {
         int[] merge=new int[ln+rm];
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<ln && j<rm){
            if(l[i] < r[j]){
                merge[k++]=l[i++];
            }
            else{
                merge[k++]=r[j++];
            }
        }
        
        while(i<ln){
              merge[k++]=l[i++];
        }
        while(j<rm){
              merge[k++]=r[j++];
        }
        
        for ( int a=0;a<ln+rm;a++)
            l[a]=merge[a];
        
        
        
    }
}

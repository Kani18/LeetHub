class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        int n=changed.length;
        int[] freq=new int[100001];
        int[] ans=new int[n/2];
        
        
        for(int i=0;i<n;i++){
            freq[changed[i]]+=1;
        }
        int in=0;
        for(int i=0;i<freq.length;i++){
            
            while(freq[i]>0 && i*2<100001 && freq[i*2]>0){
                freq[i]--;
                freq[i*2]--;
                if(freq[i*2]<0){
                    return new int[] {};
                }
                ans[in++]=i;
                
            }
        }
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)
                 return new int[] {};
     }
        return ans;
        
    }
}
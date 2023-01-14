class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashMap<Character,Integer> mpp=new HashMap<>();
        int n=s.length();
        if(n==0)
             return 0;
        
        int windowstart=0;
        int maxlen=0;
        
        for(int windowend=0;windowend<n;windowend++){
            char ch=s.charAt(windowend);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            
            
            while(mpp.get(ch)>1){
                char start=s.charAt(windowstart++);
                mpp.put(start,mpp.get(start)-1);
            }
            maxlen=Math.max(maxlen,windowend-windowstart+1);
            
        }
        return maxlen;
    }
}
    
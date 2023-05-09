class Solution {
    public int longestContinuousSubstring(String s) {
        
        int n=s.length();
        int start=0;
        int end=0;
        int maxlength=0;
        
        while(end<n){
            
            while(end<n-1 && s.charAt(end)+1==s.charAt(end+1))
                end++;
        
        maxlength=Math.max(maxlength,end-start+1);
        end++;
        start=end;
        }
        return maxlength;
    }
}
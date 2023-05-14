class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n=tokens.length;
        int score=0;
        int l=0;
        int r=n-1;
        int maxi=0;
        
        while(l<=r){
            if(power>=tokens[l]){
                power=power-tokens[l];
                score=score+1;
                maxi=Math.max(maxi,score);
                l++;
            }
            else if(score>0){
                power=power+tokens[r];
                score=score-1;
                r--;
            }
            else{
                break;
            }
        }
        return maxi;
        
    }
}
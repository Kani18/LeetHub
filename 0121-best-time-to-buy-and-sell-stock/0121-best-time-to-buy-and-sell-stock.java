class Solution {
    public int maxProfit(int[] prices) {
          
        int min=prices[0];
        int max_profit=0;
        
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(max_profit<(prices[i]-min)){
                max_profit=prices[i]-min;
            }
        }
        
        return max_profit;
   
    }
}
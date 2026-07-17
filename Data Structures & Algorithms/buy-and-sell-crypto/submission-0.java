class Solution {
    public int maxProfit(int[] prices) {
        
        int left=0; int right=prices.length-1;
        int res=0;
        while(left<prices.length){
            while(right>left){
                int profit=prices[right]-prices[left];
                if(res<profit){
                    res=profit;
                } 
                right--;
            }
            left++;
            right=prices.length-1;
            
        }
        return res;
    }
}

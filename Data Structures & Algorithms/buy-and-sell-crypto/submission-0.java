class Solution {
    public int maxProfit(int[] prices) {
        int i =0;
        int j = i+1;
        int maxP = 0;

        while(j < prices.length) {
            if(prices[j] <= prices[i]) {
                i = j;
                j = i+1;
            } else {
                maxP = Math.max(maxP, prices[j]- prices[i]);
                j++;
            }
        }

        return maxP;
    }
}

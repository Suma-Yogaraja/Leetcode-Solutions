class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(minBuy>prices[i]){
            //buy the stock
              minBuy=prices[i];
             // System.out.println("min buy :" + minBuy);
            }
            else{
                int profit=prices[i]-minBuy;
                maxProfit=Math.max(maxProfit,profit);
               // System.out.println("max Profit :" +maxProfit);
            }
        }
        return maxProfit;
    }
}






//         int min = prices[0];
//         int maxProfit = 0;
//         for (int i = 1; i < prices.length; i++) {
//             if (prices[i] < min) {
//                 min=prices[i];
//             }
//             else{
//                 int profit=prices[i]-min;
//                 maxProfit=Math.max(maxProfit,profit);
//             }

//         }
//         return maxProfit;

//     }
// }
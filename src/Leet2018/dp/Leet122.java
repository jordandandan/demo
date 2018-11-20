package Leet2018.dp;

/**
 * @author bjxujiayi
 * @create 2018-11-20 14:39
 **/
public class Leet122 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int res = 0;
        for(int i =0;i<prices.length - 1;i++){
            while(i<prices.length - 1 && prices[i] >= prices[i+1]){
                i++;
            }
            minPrice = prices[i];
            while(i<prices.length - 1 &&prices [i] <= prices[i+1]){
                i++;
            }
            res += (prices[i] - minPrice);
        }
        return res;
    }
}

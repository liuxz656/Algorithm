
//https://satin-piper-4c1.notion.site/2-II-3195011cff08401b969bc97352ac1702
public class MaxProfit {
    public int maxProfit(int[] prices){
        if (prices.length <= 1) return 0;
        int max = 0;
        int temp;
        for (int day = 1; day < prices.length; day++) {
            temp = prices[day] - prices[day - 1];
            if (temp > 0) max += temp;
        }
        return max;
    }
}

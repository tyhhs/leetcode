public class Best_Time_to_Buy_and_Sell_Stock {

	/**
	 * Say you have an array for which the ith element is the price of a given
	 * stock on day i.
	 * 
	 * If you were only permitted to complete at most one transaction (ie, buy
	 * one and sell one share of the stock), design an algorithm to find the
	 * maximum profit.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices={3,2,6,5,0,3,7,20,33};
		System.out.println(maxProfit(prices));
	}
    public static int maxProfit(int[] prices) {
    	if(prices.length==0){
    		return 0;
    	}
    	//profit[i] presents the profit of i+1th day
        int[] profit=new int[prices.length];
        int min=prices[0];
        profit[0]=0;
        int i;
        for(i=1;i<prices.length;i++){
        	//idea
        	//max profit at ith day is the max of price of ith day minus min of previous i-1 days and max profit of i-1 previous day
        	profit[i]=(prices[i]-min)>profit[i-1]?(prices[i]-min):profit[i-1];
        	//update the minimum value of previous i days
        	min=min<prices[i]?min:prices[i];
        }
        return profit[i-1];
    }
}

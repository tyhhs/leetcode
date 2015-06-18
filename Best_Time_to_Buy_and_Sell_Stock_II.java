public class Best_Time_to_Buy_and_Sell_Stock_II {

	/**
	 * Say you have an array for which the ith element is the price of a given
	 * stock on day i.
	 * 
	 * Design an algorithm to find the maximum profit. You may complete as many
	 * transactions as you like (ie, buy one and sell one share of the stock
	 * multiple times). However, you may not engage in multiple transactions at
	 * the same time (ie, you must sell the stock before you buy again).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices={3,2,6,5,0,3};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		//idea
		//this is greedy algorithm
		int res=0;
		for(int i=0;i<prices.length-1;i++){
			if(prices[i]<prices[i+1]){
				res+=prices[i+1]-prices[i];
			}
		}
		return res;
	}
}

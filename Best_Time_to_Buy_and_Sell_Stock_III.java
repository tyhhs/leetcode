public class Best_Time_to_Buy_and_Sell_Stock_III {

	/**
	 * Say you have an array for which the ith element is the price of a given
	 * stock on day i.
	 * 
	 * Design an algorithm to find the maximum profit. You may complete at most
	 * two transactions.
	 * 
	 * Note: You may not engage in multiple transactions at the same time (ie,
	 * you must sell the stock before you buy again).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] prices={3,5,0,3,2,6,8,4};
		int[] prices={};
		System.out.println(maxProfit(prices));
	}

	/**
	 * First consider the case that when we are only allowed to make one
	 * transaction. we can handle this easily with DP. If we move forward, any
	 * new price we meet will only affect our history result by two ways:
	 * 
	 * will it be so low that it beats our previous lowest price? will it be so
	 * high that we should instead sell on this time to gain a higher profit
	 * (than the history record)? Similarly, we can move backward with the
	 * highest price and profit in record. Either way would take O(n) time. Now
	 * consider the two transaction case. Since there will be no overlaps, we
	 * are actually dividing the whole time into two intervals.
	 * 
	 * We want to maximize the profit in each of them so the same method above
	 * will apply here. We are actually trying to break the day at each time
	 * instance, by adding the potential max profit before and after it
	 * together. By recording history and future for each time point, we can
	 * again do this within O(n) time.
	 */
	public static int maxProfit(int[] prices) {

		if(prices.length==0){
			return 0;
		}
		int[] forward_highest=new int[prices.length];
		int[] backward_highest=new int[prices.length];
		int local_min=prices[0];
		int local_max=prices[prices.length-1];
		int total_max;
		forward_highest[0]=0;
		//calculate the forward highest
		for(int i=1;i<prices.length;i++){
			forward_highest[i]=Math.max(prices[i]-local_min, forward_highest[i-1]);
			local_min=Math.min(local_min, prices[i]);
		}
		
		//backward to calculate maximum profit between day i to end day
		backward_highest[prices.length-1]=0;
		for(int i=prices.length-2;i>=0;i--){
			backward_highest[i]=Math.max(backward_highest[i+1], local_max-prices[i]);
			local_max=Math.max(local_max, prices[i]);
		}
		
		//calculate total max
		total_max=0;
		for(int i=0;i<prices.length;i++){
			total_max=Math.max(total_max, forward_highest[i]+backward_highest[i]);
			
		}
		return total_max;
	}
}

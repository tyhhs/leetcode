import java.util.Arrays;

public class House_Robber_II {

	/**
	 * This problem is a little tricky at first glance. However, if you have
	 * finished the House Robber problem, this problem can simply be decomposed
	 * into two House Robber problems. Suppose there are n houses, since house 0
	 * and n - 1 are now neighbors, we cannot rob them together and thus the
	 * solution is now the maximum of
	 * 
	 * Rob houses 0 to n - 2; Rob houses 1 to n - 1. The code is as follows
	 * (some edge cases are handled explicitly).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,3,4,5,6,7,8,9,10,11,12};
		House_Robber a=new House_Robber();
		System.out.println(a.rob(num));
	}

	public int rob(int[] nums) {
		int length=nums.length;
		if(length==0){
			return 0;
		}
		else if (length==1) {
			return nums[0];
		}
		else{
			int rob1=helper(Arrays.copyOfRange(nums, 0, length-1));
			int rob2=helper(Arrays.copyOfRange(nums, 1, length));
			return Math.max(rob1, rob2);
		}
		
	}
	
	public int helper(int[] nums){
		int rob=0;
		int noRob=0;
		int temp;
		for(int i=0;i<nums.length;i++){
			temp=noRob;
			noRob=Math.max(noRob, rob);
			rob=temp+nums[i];
		}
		return Math.max(rob, noRob);
	}
}

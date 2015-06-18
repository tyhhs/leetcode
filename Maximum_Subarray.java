public class Maximum_Subarray {

	/**
	 * Find the contiguous subarray within an array (containing at least one
	 * number) which has the largest sum.
	 * 
	 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4], 
	 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
	 * 
	 * More practice: If you have figured out the O(n) solution, try coding
	 * another solution using the divide and conquer approach, which is more subtle.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={-2,1,-3,4,-1,2,1,-5,4};	
		System.out.println(maxSubArray(A));
	}
    public static int maxSubArray(int[] A) {
        if(A.length==0){
        	return A[0];
        }
    	int max=A[0];
        int previous=A[0];
        int local_sum;
        for(int i=1;i<A.length;i++){
        	local_sum=previous+A[i]<A[i]?A[i]:previous+A[i];
        	max=max<local_sum?local_sum:max;
        	previous=local_sum;
        }
        return max;
    }

}

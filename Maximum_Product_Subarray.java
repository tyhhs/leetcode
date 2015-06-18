public class Maximum_Product_Subarray {

	/**
	 * Find the contiguous subarray within an array (containing at least one
	 * number) which has the largest product.
	 * 
	 * For example, given the array [2,3,-2,4], the contiguous subarray [2,3]
	 * has the largest product = 6.
	 */
	
	//Note: There's no need to use O(n) space, as all that you need is a 
	//minhere and maxhere. (local max and local min), then you can get maxsofar 
	//(which is global max) from them.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={2,3,-2,4};
		int B[]={0,2,0};
		System.out.println(maxProduct(B));
	}
    public static int maxProduct(int[] A) {
        int max_before=A[0];
        int min_before=A[0];
        int max=A[0];
        int max_here=0;
        int min_here=0;
        for(int i=1;i<A.length;i++){
        	max_here=Math.max(Math.max(max_before*A[i], min_before*A[i]), A[i]);
        	min_here=Math.min(Math.min(max_before*A[i], min_before*A[i]), A[i]);
        	max=Math.max(max_here, max);
        	max_before=max_here;
        	min_before=min_here;
        }
        return max;
    }
}

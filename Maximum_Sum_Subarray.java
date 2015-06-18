
public class Maximum_Sum_Subarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={2,3,-2,4,10000,-100};
		System.out.println(maxSum(A));
	}
	public static int maxSum(int[] A){
		int max_before=A[0];
		int max=A[0];
		int max_here=0;
		for(int i=1;i<A.length;i++){
			max_here=Math.max(max_before+A[i], A[i]);
			max=Math.max(max_here, max);
			max_before=max_here;
		}
		return max;
	}

}

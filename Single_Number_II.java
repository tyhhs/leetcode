
public class Single_Number_II {

	/**
	 * Given an array of integers, every element appears three times except for one. 
	 * Find that single one.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,3,1,2,3,4,3,2,1,-1,-1,-1};
		System.out.println(singleNumber(A));
		//System.out.println(1^-1);
		//System.out.println(2<<2);
	}
    public static int singleNumber(int[] A) {
    	 int ones = 0, twos = 0, threes = 0;
    	    for (int i = 0; i < A.length; i++) {
    	        twos |= ones & A[i];
    	        ones ^= A[i];
    	        threes = ones & twos;
    	        ones &= ~threes;
    	        twos &= ~threes;
    	    }
    	    return ones;
    }

}
